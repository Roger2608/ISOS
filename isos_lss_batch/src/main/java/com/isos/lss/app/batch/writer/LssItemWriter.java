package com.isos.lss.app.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.isos.lss.app.model.category.LenguaSordo;

public class LssItemWriter implements ItemWriter<LenguaSordo>{
	
	//Importar repository para conección a DB
	
	@Override
	public void write(List<? extends LenguaSordo> items) throws Exception {
		
		System.out.println(items.toString());
		
	}

}
