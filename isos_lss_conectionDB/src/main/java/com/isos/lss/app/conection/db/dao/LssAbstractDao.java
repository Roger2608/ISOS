package com.isos.lss.app.conection.db.dao;

import java.util.List;

import com.isos.lss.app.conection.db.model.IsosLssCategorys;

public interface LssAbstractDao {

	public void saveAll(List<IsosLssCategorys> data);

	public void saveAll(IsosLssCategorys data);

	public List<?> findAll();

	public List<?> findBy(Object indication);

}
