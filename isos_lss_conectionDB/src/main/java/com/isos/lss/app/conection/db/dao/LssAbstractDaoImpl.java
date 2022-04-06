package com.isos.lss.app.conection.db.dao;

import static com.isos.lss.app.conection.db.util.Constants.BEGGIN_METHOD;
import static com.isos.lss.app.conection.db.util.Constants.END_METHOD;
import static com.isos.lss.app.conection.db.util.Constants.TRUNCATED_METHOD;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.isos.lss.app.conection.db.model.IsosLssCategorys;
import com.isos.lss.app.conection.db.repository.LssAbstractRepository;
import com.isos.lss.app.model.category.LenguaSordo;

@Service
public class LssAbstractDaoImpl implements LssAbstractDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(LssAbstractDaoImpl.class);

	@Autowired
	LssAbstractRepository repository;

	@Override
	public void saveAll(List<IsosLssCategorys> data) {
		final String METHOD = "saveAll";

		LOGGER.info(BEGGIN_METHOD, METHOD, data);
		try {
			repository.saveAll(data);
		} catch (Exception e) {
			LOGGER.error(TRUNCATED_METHOD, METHOD, e.getMessage());
		}
		LOGGER.info(END_METHOD, METHOD);
	}
	
	@Override
	public void saveAll(IsosLssCategorys data) {
		final String METHOD = "saveAll";

		LOGGER.info(BEGGIN_METHOD, METHOD, data);
		try {
			repository.save(data);
		} catch (Exception e) {
			LOGGER.error(TRUNCATED_METHOD, METHOD, e.getMessage());
		}
		LOGGER.info(END_METHOD, METHOD);
	}


	@Override
	public List<IsosLssCategorys> findAll() {
		final String METHOD = "findAll";
		LOGGER.info(BEGGIN_METHOD, METHOD, null);
		List<IsosLssCategorys> lista = null;
		try {
			lista = repository.findAll();
		} catch (Exception e) {
			LOGGER.error(TRUNCATED_METHOD, METHOD, e.getMessage());
		}
		LOGGER.info(END_METHOD, METHOD);
		return lista;
	}

	@Override
	public List<IsosLssCategorys> findBy(Object indication) {
		final String METHOD = "findBy";
		LOGGER.info(BEGGIN_METHOD, METHOD, indication);
		List<IsosLssCategorys> lista = null;
		try {
			ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAny()
					.withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
					.withMatcher("category", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());

			Example<IsosLssCategorys> example = Example.of((IsosLssCategorys)indication, customExampleMatcher);

			lista = repository.findAll(example);
		} catch (Exception e) {
			LOGGER.error(TRUNCATED_METHOD, METHOD, e.getMessage());
		}
		LOGGER.info(END_METHOD, METHOD);
		return lista;
	}
	
	@Override
	public IsosLssCategorys findByName(String name) {
		final String METHOD = "findByName";
		LOGGER.info(BEGGIN_METHOD, METHOD, name);
		IsosLssCategorys lista = null;
		try {
			lista = repository.findByName(name);
		} catch (Exception e) {
			LOGGER.error(TRUNCATED_METHOD, METHOD, e.getMessage());
		}
		LOGGER.info(END_METHOD, METHOD);
		return lista;
	}

}
