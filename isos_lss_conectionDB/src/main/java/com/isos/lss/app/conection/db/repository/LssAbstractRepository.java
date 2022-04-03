package com.isos.lss.app.conection.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.isos.lss.app.conection.db.model.IsosLssCategorys;

@Repository
public interface LssAbstractRepository extends MongoRepository<IsosLssCategorys, String>{

}
