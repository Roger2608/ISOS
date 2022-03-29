package com.isos.lss.app.conection.db.dao;

import java.util.List;

import com.isos.lss.app.model.category.LenguaSordo;

public interface LssAbstractDao {
	
	public void saveAll(List<LenguaSordo> data);

	public List<?> findAll();
	
	public List<?> findBy(Object indication);
	
}
