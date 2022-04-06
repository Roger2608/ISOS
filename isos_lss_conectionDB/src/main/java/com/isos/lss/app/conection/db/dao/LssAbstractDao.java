package com.isos.lss.app.conection.db.dao;

import java.util.List;

import com.isos.lss.app.conection.db.model.IsosLssCategorys;

public interface LssAbstractDao {

	public void saveAll(List<IsosLssCategorys> data);

	public void saveAll(IsosLssCategorys data);

	public List<IsosLssCategorys> findAll();

	public List<IsosLssCategorys> findBy(Object indication);

	IsosLssCategorys findByName(String name);

}
