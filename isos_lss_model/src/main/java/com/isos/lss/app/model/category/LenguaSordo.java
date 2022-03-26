package com.isos.lss.app.model.category;

import java.io.Serializable;
import java.time.LocalDate;

import com.isos.lss.app.model.enums.Category;
import com.isos.lss.app.model.enums.SubCategory;

public class LenguaSordo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String short_description;
	private String long_description;
	private String imagen;
	private Category categoria;
	private SubCategory sub_category;
	private LocalDate last_update;

	public LenguaSordo(String id, String name, String short_description, String long_description, String imagen,
			Category categoria, SubCategory sub_category, LocalDate last_update) {
		super();
		this.id = id;
		this.name = name;
		this.short_description = short_description;
		this.long_description = long_description;
		this.imagen = imagen;
		this.categoria = categoria;
		this.sub_category = sub_category;
		this.last_update = last_update;
	}

	public LenguaSordo() {
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

	public Category getCategoria() {
		return categoria;
	}

	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}

	public SubCategory getSub_category() {
		return sub_category;
	}

	public void setSub_category(SubCategory sub_category) {
		this.sub_category = sub_category;
	}

	public LocalDate getLast_update() {
		return last_update;
	}

	public void setLast_update(LocalDate last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "LenguaSordo [id=" + id + ", name=" + name + ", short_description=" + short_description
				+ ", long_description=" + long_description + ", imagen=" + imagen + ", categoria=" + categoria
				+ ", sub_category=" + sub_category + ", last_update=" + last_update + "]";
	}
}
