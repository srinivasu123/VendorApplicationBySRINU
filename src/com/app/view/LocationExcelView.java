package com.app.view;

import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Location;

public class LocationExcelView  extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook book, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		resp.addHeader("Content-Disposition", "attachment; filename=LOCATIONs.xls");
		List<Location> locs=(List<Location>) map.get("locs");
		HSSFSheet sheet=book.createSheet("locs");
		sethead(sheet);
		setBody(sheet, locs);
	}
	public void sethead(HSSFSheet sheet){
		int rownum=0;
		HSSFRow row=sheet.createRow(rownum);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Name");
		row.createCell(2).setCellValue("Code");
		row.createCell(3).setCellValue("Type");
		row.createCell(4).setCellValue("Note");
	}
	public void setBody(HSSFSheet sheet, List<Location> locs){
		int rownum=1;
		for(Location loc:locs){
			HSSFRow row=sheet.createRow(rownum++);
			row.createCell(0).setCellValue(loc.getLocId());
			row.createCell(1).setCellValue(loc.getLocName());
			row.createCell(2).setCellValue(loc.getLocCode());
			row.createCell(3).setCellValue(loc.getLocType());
			row.createCell(4).setCellValue(loc.getLocDesc());
			
			
		}
		
	}

}
