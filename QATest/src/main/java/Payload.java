import org.testng.annotations.DataProvider;

public class Payload {

	@DataProvider
	public Object[][] data(){
		Object[][] obj = {{"abc","1000","25"}};
		return obj;
	}
	
	
}
