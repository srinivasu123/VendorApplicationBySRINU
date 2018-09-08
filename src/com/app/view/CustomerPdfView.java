package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Customer;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class CustomerPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter pw, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		resp.addHeader("Content-Disposition", "attachment; filename=Customers.pdf");
		List<Customer> custs=(List<Customer>) map.get("custs");
		Paragraph p=new Paragraph("Welcome to Locations pdf file!!!!!!");
		PdfPTable table=new PdfPTable(7);
		table.addCell("ID");
		table.addCell("NAME");
		table.addCell("Email");
		table.addCell("Type");
		table.addCell("Address");
		table.addCell("Passwrd");
		table.addCell("Token");
		for(Customer cust:custs){
			table.addCell(cust.getCustId()+"");
			table.addCell(cust.getCustName());
			table.addCell(cust.getCustEmail());
			table.addCell(cust.getCustType());
			table.addCell(cust.getCustAddress());
			table.addCell(cust.getPassword());
			table.addCell(cust.getAcctoken());
			
			
		}
		doc.add(p);
		doc.add(table);
		doc.add(new Paragraph(new Date().toString()));
		
		

	}

}
