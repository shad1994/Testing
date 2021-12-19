import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequestRest {
	
	public static Response postCall(String body) {
		//RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/";
		Response response = RestAssured.given().log().all().body(body).header("Content-Type", "application/json")
				.when().post("create").then().extract().response();
		return response;
	}
	
	public static Response getCall(int id) {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v2";
		String uri;
		if(id==0) {
			uri="/employees";
		}else
			uri="/employees"+id;
		Response response = RestAssured.when().get(uri).then().extract().response();
		return response;
	}
	
	public static Response deleteCall(int id) {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v2";
		return RestAssured.when().delete("/delete").then().extract().response();
	}
	
	public static Response putCall(int id,String body) {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v2";
		return RestAssured.given().body(body).when().delete("/update/"+id).then().extract().response();
	}

}
