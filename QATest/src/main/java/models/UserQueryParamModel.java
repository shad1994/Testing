package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserQueryParamModel {

	@JsonProperty("page")
	private String page;
	
	@JsonProperty("size")
	private String size;
	
	@JsonProperty("sort")
	private String sort;

	@JsonProperty("id")
	private String id;
	
	
	
	
}
