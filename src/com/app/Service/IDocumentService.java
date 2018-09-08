package com.app.Service;

import java.util.List;

import com.app.model.Document;

public interface IDocumentService {
	public int saveDocument(Document doc);
	public  List<Object[]> getDocsIDAndName(); 
	public Document getDocumentById(int fileId);


}
