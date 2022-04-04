package com.isos.lss.app.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.isos.lss.app.conection.db.dao.LssAbstractDao;
import com.isos.lss.app.conection.db.model.IsosLssCategorys;

public class LssItemWriter implements ItemWriter<IsosLssCategorys>{
	
	@Autowired
	LssAbstractDao lssAbstractDao;
	
	@SuppressWarnings("unchecked")
	@Override
	public void write(List<? extends IsosLssCategorys> items) throws Exception {
		lssAbstractDao.saveAll((List<IsosLssCategorys>) items);
		System.out.println(items.toString());
	}

}
