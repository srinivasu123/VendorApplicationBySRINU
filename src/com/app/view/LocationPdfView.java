package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Location;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class LocationPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter pw, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		resp.addHeader("Content-Disposition", "attachment; filename=LOCATIONs.pdf");
		List<Location> locs=(List<Location>) map.get("locs");
		Paragraph p=new Paragraph("Welcome to Locations pdf file!!!!!!");
		PdfPTable table=new PdfPTable(5);
		table.addCell("ID");
		table.addCell("NAME");
		table.addCell("CODE");
		table.addCell("Type");
		table.addCell("NOTE");
		for(Location loc:locs){
			table.addCell(loc.getLocId()+"");
			table.addCell(loc.getLocName());
			table.addCell(loc.getLocCode());
			table.addCell(loc.getLocType());
			table.addCell(loc.getLocDesc());
			
			
		}
		doc.add(p);
		doc.add(table);
		doc.add(new Paragraph(new Date().toString()));
		
		
	}
	

}
