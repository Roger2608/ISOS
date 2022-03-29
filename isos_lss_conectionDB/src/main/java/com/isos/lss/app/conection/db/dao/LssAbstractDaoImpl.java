package com.isos.lss.app.conection.db.dao;

import static com.isos.lss.app.conection.db.util.Constants.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.isos.lss.app.conection.db.repository.LssAbstractRepository;
import com.isos.lss.app.model.category.LenguaSordo;

@Service
public class LssAbstractDaoImpl implements LssAbstractDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(LssAbstractDaoImpl.class);

	@Autowired
	LssAbstractRepository repository;

	@Override
	public void saveAll(List<LenguaSordo> data) {
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
	public List<?> findAll() {
		final String METHOD = "findAll";
		LOGGER.info(BEGGIN_METHOD, METHOD, null);
		List<?> lista = null;
		try {
			lista = repository.findAll();
		} catch (Exception e) {
			LOGGER.error(TRUNCATED_METHOD, METHOD, e.getMessage());
		}
		LOGGER.info(END_METHOD, METHOD);
		return lista;
	}

	@Override
	public List<LenguaSordo> findBy(Object indication) {
		final String METHOD = "findBy";
		LOGGER.info(BEGGIN_METHOD, METHOD, indication);
		List<LenguaSordo> lista = null;
		try {
			ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAny()
					.withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
					.withMatcher("category", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());

			Example<LenguaSordo> example = Example.of((LenguaSordo)indication, customExampleMatcher);

			lista = repository.findAll(example);
		} catch (Exception e) {
			LOGGER.error(TRUNCATED_METHOD, METHOD, e.getMessage());
		}
		LOGGER.info(END_METHOD, METHOD);
		return lista;
	}

}
