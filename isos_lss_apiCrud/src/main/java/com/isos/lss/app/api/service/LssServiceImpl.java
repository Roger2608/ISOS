package com.isos.lss.app.api.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isos.lss.app.api.expose.model.Data;
import com.isos.lss.app.api.util.ExposeWebUtil;
import com.isos.lss.app.conection.db.dao.LssAbstractDao;
import com.isos.lss.app.conection.db.model.IsosLssCategorys;
import com.isos.lss.app.model.enums.Category;
import com.isos.lss.app.model.enums.SubCategory;

@Component
public class LssServiceImpl implements LssService{
	
	@Autowired
	LssAbstractDao abstractDao;

	@SuppressWarnings("unchecked")
	@Override
	public List<Data> findAll() {
//		abstractDao.saveAll(new IsosLssCategorys("asd3", "adssadasd", "asdasdas", "asdasd", "asdasdasd", Category.NOT_CATEGORY, SubCategory.NOT_SUB_CATEGORY, LocalDateTime.now()));
		
//		return abstractDao.findAll().forEach(a -> ExposeWebUtil.transformtoData(a));
		
		return (List<Data>) abstractDao.findAll()
										.parallelStream()
										.map(a -> ExposeWebUtil.transformToData(abstractDao, (IsosLssCategorys) a))
										.collect(Collectors.toList());
	}

	@Override
	public List<Data> findBy(IsosLssCategorys indication) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
