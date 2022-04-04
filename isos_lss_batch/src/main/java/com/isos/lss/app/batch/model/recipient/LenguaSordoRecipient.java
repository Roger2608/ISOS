package com.isos.lss.app.batch.model.recipient;

import java.io.Serializable;

public class LenguaSordoRecipient implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String short_description;
	private String long_description;
	private String imagen;
	private String categoria;
	private String sub_category;
	
	public LenguaSordoRecipient(String id, String name, String short_description, String long_description,
			String imagen, String categoria, String sub_category) {
		super();
		this.id = id;
		this.name = name;
		this.short_description = short_description;
		this.long_description = long_description;
		this.imagen = imagen;
		this.categoria = categoria;
		this.sub_category = sub_category;
	}

	public LenguaSordoRecipient() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}

	public String getLong_description() {
		return long_description;
	}

	public void setLong_description(String long_description) {
		this.long_description = long_description;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSub_category() {
		return sub_category;
	}

	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}

	@Override
	public String toString() {
		return "LenguaSordoRecipient [id=" + id + ", name=" + name + ", short_description=" + short_description
				+ ", long_description=" + long_description + ", imagen=" + imagen + ", categoria=" + categoria
				+ ", sub_category=" + sub_category + "]";
	}

}