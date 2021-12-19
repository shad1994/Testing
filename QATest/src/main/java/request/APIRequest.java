package request;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.UserQueryParamModel;
import util.GenericMethods;

public class APIRequest {
	public String baseURI = "http://localhost:8080/api";

	public Response createUser( String json) {
		RestAssured.baseURI = baseURI;

		Response response = RestAssured.given().log().all().contentType("application/json").body(json).post("/users");
		
		System.out.println("response : "+response.asString());
		return response;
	}

	//sortingField  : asc /desc/null
	public Response getUsers(int page, int size, int id, String sortingField) {
		RestAssured.baseURI = baseURI;
		String endPoint = "/users/";
		if (id != 0) {
			endPoint = endPoint + id;

		}
		UserQueryParamModel model = new UserQueryParamModel();
		if (page != 0) {
			model.setPage(page + "");

		}
		if (size != 0) {
			model.setSize(size + "");

		}

		if (sortingField != null && !sortingField.equalsIgnoreCase("NA")) {
				model.setSort(sortingField + ",asc");
		}

		Response response = RestAssured.given().queryParams(GenericMethods.convertModelToHashMap(model)).get(endPoint);

		System.out.println(response.asString());
		return response;
	}

	public Response deleteUser(int id) {
		RestAssured.baseURI = baseURI;

		Response response = RestAssured.given().delete("/users/" + id);

		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		return response;
	}

	
}
