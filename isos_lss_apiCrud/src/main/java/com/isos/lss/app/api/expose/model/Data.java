package com.isos.lss.app.api.expose.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {

	private String id;
	private String name;
	private String short_description;
	private String long_description;
	private String imagen;
	private String categoria;
	private String sub_category;
	private LocalDateTime last_update;
	private List<?> family;
}
