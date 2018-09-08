package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Vendor;

public class VendorExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook book, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		resp.addHeader("Content-Disposition", "attachment; filename=VENDORs.xls");
		List<Vendor> vens=(List<Vendor>) map.get("vens");
		HSSFSheet sheet=book.createSheet("vens");
		sethead(sheet);
		setBody(sheet, vens);
	}
	public void sethead(HSSFSheet sheet){
		int rownum=0;
		HSSFRow row=sheet.createRow(rownum);
		row.createCell(0).setCellValue("VENDORID");
		row.createCell(1).setCellValue("VENDORCODE");
		row.createCell(2).setCellValue("VENDORNAME");
		row.createCell(3).setCellValue("VENDORTYPE");
		row.createCell(4).setCellValue("ADDRESS");
		row.createCell(5).setCellValue("VENDOR IDPROOF");
		row.createCell(6).setCellValue("VENDOR IDNUMBER");
		row.createCell(7).setCellValue("NOTE");
	}
	public void setBody(HSSFSheet sheet, List<Vendor> vens){
		int rownum=1;
		for(Vendor ven:vens){
			HSSFRow row=sheet.createRow(rownum++);
			row.createCell(0).setCellValue(ven.getVenid());
			row.createCell(1).setCellValue(ven.getVencode());
			row.createCell(2).setCellValue(ven.getVenName());
			row.createCell(3).setCellValue(ven.getVenType());
			row.createCell(4).setCellValue(ven.getAddr());
			row.createCell(5).setCellValue(ven.getIdType());
			row.createCell(6).setCellValue(ven.getIdNum());
			row.createCell(7).setCellValue(ven.getDsc());
			
			
		}
		

	}

}
