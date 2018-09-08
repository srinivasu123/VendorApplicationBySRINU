package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.Service.IDocumentService;
import com.app.model.Document;

@Controller
public class DocumentController {
	@Autowired
	private IDocumentService service;
	//1.Show document page
	@RequestMapping(value="/ShowDocs")
	public String ShowDocument(ModelMap map){
		List<Object[]> obs=service.getDocsIDAndName();
		map.addAttribute("docs", obs);
		return "Documents";
	}
	
	//2.Upload doc
	@RequestMapping(value="/Uploaddoc",method=RequestMethod.POST)
	public String UploadDocuments(@RequestParam("fileId") int fileId,@RequestParam("fileOb")CommonsMultipartFile cmf){
		if(cmf!=null){
			//create model class object
			Document doc=new Document();
			doc.setFileId(fileId);
			doc.setFileName(cmf.getOriginalFilename());
			doc.setFileData(cmf.getBytes());
			service.saveDocument(doc);
			
		}
		
		
		return"redirect:ShowDocs";
	}
	//3.Downloading operation
	@RequestMapping("/downloadDoc")
	public void DownloadDocument(@RequestParam("docId")int fileId,HttpServletResponse resp){
		Document doc=service.getDocumentById(fileId);
		resp.addHeader("Content-Disposition", "attachement;filename="+doc.getFileName());
		try {
			FileCopyUtils.copy(doc.getFileData(), resp.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

