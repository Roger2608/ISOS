package com.isos.lss.app.batch.processor;

import java.time.LocalDateTime;

import org.springframework.batch.item.ItemProcessor;

import com.isos.lss.app.batch.model.recipient.LenguaSordoRecipient;
import com.isos.lss.app.model.category.LenguaSordo;
import com.isos.lss.app.model.enums.Category;
import com.isos.lss.app.model.enums.SubCategory;

public class LssItemProcessor implements ItemProcessor<LenguaSordoRecipient, LenguaSordo> {

	@Override
	public LenguaSordo process(LenguaSordoRecipient item) throws Exception {

		LenguaSordo lenguaSordo = new LenguaSordo();
		lenguaSordo.setId(item.getId());
		lenguaSordo.setName(item.getName());
		lenguaSordo.setShort_description(item.getShort_description());
		lenguaSordo.setLong_description(item.getLong_description());
		lenguaSordo.setImagen(item.getImagen());
		lenguaSordo.setCategoria(returnCategory(item.getName()));
		lenguaSordo.setSub_category(returnSubCategory(item.getName()));
		lenguaSordo.setLast_update(LocalDateTime.now());

		return lenguaSordo;
	}

	private Category returnCategory(String category) {
		try {
			Category newCategory = Category.valueOf(category);
			return newCategory;
		} catch (Exception e) {
			return Category.NOT_CATEGORY;
		}
	}

	private SubCategory returnSubCategory(String subCategory) {
		try {
			SubCategory newSubCategory = SubCategory.valueOf(subCategory);
			return newSubCategory;
		} catch (Exception e) {
			return SubCategory.NOT_SUB_CATEGORY;
		}
	}
}
