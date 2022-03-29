package com.isos.lss.app.conection.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.isos.lss.app.model.category.LenguaSordo;

@Repository
public interface LssAbstractRepository extends MongoRepository<LenguaSordo, String>{

}
