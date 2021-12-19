package RingCentral.QATest;

import org.testng.Assert;
import org.testng.annotations.Test;

import groovyjarjarasm.asm.commons.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import request.APIRequest;
import util.GenericMethods;

public class ApiTests 
{
//	int user_id;
//	
//	
//	/***************************************************** POST call verification ***************************************
//	 * Some cases are skipped .There may develop multiple cases on input fields to create a user.Some of them are commented below:
//	 * 1. validate that id should only be numeric
//	 * 2. Firstname length should not be less than 2 and greater than 15
//	 * 3. Lastname length should not be less than 2 and greater than 15 
//	 * 4. More cases may form on invalid email (ex: test.com,test,test@gmail etc.)
//	 * 5. Some cases may form on the DOB format in which user can enter date of birth*/
//	
//	@Test
//	public void successfullyCreateUser(){
//		String email = GenericMethods.generateRandomEmail();
//		String json = "{\"firstName\":\"Test\",\"lastName\":\"User\",\"email\":\""+email+"\",\"dayOfBirth\":\"1994-06-24\"}";
//	       
//	    Response response = new APIRequest().createUser( json);
//        Assert.assertEquals(response.getStatusCode(), 201);
//        
//
//	    System.out.println("Response : "+response.asString());
//	    JsonPath js = new JsonPath(response.asString());
//	    Assert.assertEquals(js.getString("firstName"), "Test");
//	    Assert.assertEquals(js.getString("lastName"), "User");
//	    Assert.assertEquals(js.getString("dayOfBirth"), "1994-06-24");
//	    user_id = Integer.valueOf(js.getString("id"));
//
//	}
//	
//	@Test
//	public void validateErrorOnCreatingUser_DOBGreaterThanCurrentDate(){
//		String json = "{\"firstName\":\"Test\",\"lastName\":\"User\",\"email\":\"Test@gmail.com\",\"dayOfBirth\":\"2023-06-24\"}";
//	       
//	    Response response = new APIRequest().createUser( json);
//        Assert.assertEquals(response.getStatusCode(), 400);
//
//	    System.out.println("Response : "+response.asString());
//	    JsonPath js = new JsonPath(response.asString());
//		
//	    Assert.assertEquals(js.getString("subErrors.message"), "[must be a past date]");
//
//	}
//	
//	@Test
//	public void validateErrorOnCreatingUser_InvalidEmail(){
//		String json = "{\"firstName\":\"Test\",\"lastName\":\"User\",\"email\":\"Test@gmail\",\"dayOfBirth\":\"1994-06-24\"}";
//	       
//	    Response response = new APIRequest().createUser( json);
//        Assert.assertEquals(response.getStatusCode(), 400);
//
//	    System.out.println("Response : "+response.asString());
//	    JsonPath js = new JsonPath(response.asString());
//		
//	    Assert.assertEquals(js.getString("subErrors.message"), "[must be a well-formed email address]");
//
//	}
//	
//	/********************************************** Delete Method Cases *********************************************/
//	
//	@Test(dependsOnMethods = "successfullyCreateUser")
//	public void deleteUser(){
//	    Response response = new APIRequest().deleteUser(user_id);
//        Assert.assertEquals(response.getStatusCode(), 204);
//
//	}
//	
//	@Test(dependsOnMethods = "deleteUser")
//	public void deleteUser_AlreadyDeleted(){
//	    Response response = new APIRequest().deleteUser(user_id);
//        Assert.assertEquals(response.getStatusCode(), 404);
//	}
//	
///********************************************** GET Method Cases ***********************************************/
//	
//	@Test
//	public void getAllUsers(){
//	    Response response = new APIRequest().getUsers(0, 20, 0, null);
//        Assert.assertEquals(response.getStatusCode(), 200);
//
//	    System.out.println("Response : "+response.asString());
//	    JsonPath js = new JsonPath(response.asString());
//		
//	    Assert.assertEquals(js.getString("page.size"), "20");
//
//	}
//	
//	@Test
//	public void getSpecificUsers(){
//	    Response response = new APIRequest().getUsers(0, 20, 1, null);
//        Assert.assertEquals(response.getStatusCode(), 200);
//
//	    System.out.println("Response : "+response.asString());
//	    JsonPath js = new JsonPath(response.asString());
//		
//	    Assert.assertEquals(js.getString("id"), "1");
//
//	}
//	
//	@Test(dependsOnMethods = "deleteUser")
//	public void getDeletedUsers(){
//	    Response response = new APIRequest().getUsers(0, 20, user_id, null);
//        Assert.assertEquals(response.getStatusCode(), 404);
//
//	}	
//	
	
	@Test
	public void secondtest() {
		System.out.println("second test");
	}
}
