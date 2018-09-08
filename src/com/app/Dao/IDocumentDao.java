package com.app.Dao;

import java.util.List;

import com.app.model.Document;

public interface IDocumentDao {
	public int saveDocument(Document doc);
	public  List<Object[]> getDocsIDAndName(); 
	public Document getDocumentById(int fileId);

}
