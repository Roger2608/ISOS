package com.isos.lss.app.conection.db.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.isos.lss.app.model.category.LenguaSordo;
import com.isos.lss.app.model.enums.Category;
import com.isos.lss.app.model.enums.SubCategory;

@Document(collection = "IsosLssCategorys")
public class IsosLssCategorys extends LenguaSordo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IsosLssCategorys() {
		super();
	}

	public IsosLssCategorys(String id, String name, String short_description, String long_description, String imagen,
			Category categoria, SubCategory sub_category, LocalDateTime last_update) {
		super(id, name, short_description, long_description, imagen, categoria, sub_category, last_update);
	}

	@Id
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getShort_description() {
		// TODO Auto-generated method stub
		return super.getShort_description();
	}

	@Override
	public void setShort_description(String short_description) {
		// TODO Auto-generated method stub
		super.setShort_description(short_description);
	}

	@Override
	public String getLong_description() {
		// TODO Auto-generated method stub
		return super.getLong_description();
	}

	@Override
	public void setLong_description(String long_description) {
		// TODO Auto-generated method stub
		super.setLong_description(long_description);
	}

	@Override
	public String getImagen() {
		// TODO Auto-generated method stub
		return super.getImagen();
	}

	@Override
	public void setImagen(String imagen) {
		// TODO Auto-generated method stub
		super.setImagen(imagen);
	}

	@Override
	public Category getCategoria() {
		// TODO Auto-generated method stub
		return super.getCategoria();
	}

	@Override
	public void setCategoria(Category categoria) {
		// TODO Auto-generated method stub
		super.setCategoria(categoria);
	}

	@Override
	public SubCategory getSub_category() {
		// TODO Auto-generated method stub
		return super.getSub_category();
	}

	@Override
	public void setSub_category(SubCategory sub_category) {
		// TODO Auto-generated method stub
		super.setSub_category(sub_category);
	}

	@Override
	public LocalDateTime getLast_update() {
		// TODO Auto-generated method stub
		return super.getLast_update();
	}

	@Override
	public void setLast_update(LocalDateTime last_update) {
		// TODO Auto-generated method stub
		super.setLast_update(last_update);
	}

	
	
}
