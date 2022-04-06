package com.isos.lss.app.api.service;

import java.util.List;

import com.isos.lss.app.api.expose.model.Data;
import com.isos.lss.app.conection.db.model.IsosLssCategorys;

public interface LssService {
	
	public List<Data> findAll();

	public List<Data> findBy(IsosLssCategorys indication);

}
