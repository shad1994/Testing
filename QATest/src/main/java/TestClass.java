import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestClass {

	@BeforeSuite
	public void beforeSuite() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
	}
	
	@Test(dataProvider ="data", dataProviderClass = Payload.class)
	public void checkPostCall(String name,String salary,String age) {
		Response response=RequestRest.postCall("{\"name\":\""+name+"\",\"salary\":\""+salary+"\",\"age\":\""+age+"\"}");
		System.out.println(response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	
}
