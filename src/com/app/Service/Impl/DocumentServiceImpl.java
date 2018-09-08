package com.app.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.IDocumentDao;
import com.app.Service.IDocumentService;
import com.app.model.Document;
@Service
public class DocumentServiceImpl implements IDocumentService {
	@Autowired
	private IDocumentDao dao;

	public int saveDocument(Document doc) {
		
		return dao.saveDocument(doc);
	}

	public List<Object[]> getDocsIDAndName() {
		return dao.getDocsIDAndName();
	}
public Document getDocumentById(int fileId) {
	
	return dao.getDocumentById(fileId);
}
}
