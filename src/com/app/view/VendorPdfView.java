package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Vendor;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class VendorPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter pw, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		resp.addHeader("Content-Disposition", "attachment; filename=VENDORs.pdf");
		List<Vendor> vens=(List<Vendor>) map.get("vens");
		Paragraph p=new Paragraph("Welcome to Locations pdf file!!!!!!");
		PdfPTable table=new PdfPTable(8);
		table.addCell("VENDORID");
		table.addCell("VENDORCODE");
		table.addCell("VENDORNAME");
		table.addCell("VENDORTYPE");
		table.addCell("ADDRESS");
		table.addCell("VENDOR IDPROOF");
		table.addCell("VENDOR IDNUMBER");
		table.addCell("NOTE");
		for(Vendor ven:vens){
			table.addCell(ven.getVenid()+"");
			table.addCell(ven.getVencode());
			table.addCell(ven.getVenName());
			table.addCell(ven.getVenType());
			table.addCell(ven.getAddr());
			table.addCell(ven.getIdType());
			table.addCell(ven.getIdNum());
			table.addCell(ven.getDsc());
			
			
		}
		doc.add(p);
		doc.add(table);
		doc.add(new Paragraph(new Date().toString()));
		
		

	}

}
