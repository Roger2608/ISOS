package com.isos.lss.app.api.util;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.isos.lss.app.api.expose.model.Data;
import com.isos.lss.app.conection.db.dao.LssAbstractDao;
import com.isos.lss.app.conection.db.model.IsosLssCategorys;

public class ExposeWebUtil {
	
	public static Data transformToData(LssAbstractDao abstractDao, IsosLssCategorys isosLssCategorys) {
		Data data = Data.builder()
		.id(isosLssCategorys.getId())
		.name(isosLssCategorys.getName())
		.short_description(isosLssCategorys.getShort_description())
		.long_description(isosLssCategorys.getLong_description())
		.categoria(isosLssCategorys.getCategoria().name())
		.sub_category(isosLssCategorys.getSub_category().name())
		.last_update(isosLssCategorys.getLast_update())
		.imagen(isosLssCategorys.getImagen())
//		.family(returnFamily(abstractDao, isosLssCategorys.getName()))
		.build();
		return data;
	}
	
	public static Data transformToDataFamily(LssAbstractDao abstractDao, IsosLssCategorys isosLssCategorys) {
		Data data = Data.builder()
		.id(isosLssCategorys.getId())
		.name(isosLssCategorys.getName())
		.short_description(isosLssCategorys.getShort_description())
		.long_description(isosLssCategorys.getLong_description())
		.categoria(isosLssCategorys.getCategoria().name())
		.sub_category(isosLssCategorys.getSub_category().name())
		.last_update(isosLssCategorys.getLast_update())
		.imagen(isosLssCategorys.getImagen())
		.build();
		return data;
	}
//
//	crear una api o metodo para retornar una lista de categorias segun se necesite
//	
//	public static List<Data> returnFamily(LssAbstractDao abstractDao, String name){
//		
//		
//		return Stream.of(name.split(""))
//			      .map (String::new)
//			      .distinct()
//			      .parallel()
//			      .map(a -> abstractDao.findBy(new IsosLssCategorys("", a,"","", "", "", "", LocalDateTime.now())))
//			      .
////			      .map(b -> b.parallelStream()
////			    		  .map(c -> returnFamily(abstractDao, c.getName())))
//			      .collect(Collectors.toList());;
//	}

}
