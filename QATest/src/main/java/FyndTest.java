import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FyndTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res=findNum(new int[] { 1, 2, 42, 56, 3, 4 }, 7);
		verifyResult(res, "The pair is : 4 and 3");
		findNum(new int[] { 1 }, 7);
		findNum(new int[] { 1, 2, 42 }, 7);
		findNum(new int[] { 1, 2, 42, -3, -4 }, 7);
		findNum(new int[] { 1, 2, 42, -3, -4 }, -7);
		findNum(null, -7);
	}
	@DataProvider
	public Object[][] data(){
		return new Object[][] {{new int[] {1, 2, 42, 56, 3, 4 },7}};
	}
	
	@Test(dataProvider = "data")
	public static String findNum(int n[], int sum) {
		if(n==null) {
			System.out.println("The array does not contain any interger");
			return "The array does not contain any interger";
		}
		else if (n.length == 1) {
			System.out.println("The arra doesnt have more than 1 interger");
			return "The arra doesnt have more than 1 interger";
		} else {
			Set<Integer> set = new HashSet<Integer>();
			boolean flag=false;
			for (int i : n) {
				if (set.contains(sum - i)) {
					flag=true;
					System.out.println("The pair is : " + i + " and " + (sum - i));
				} else
					set.add(i);
			}
			if(!flag) {
				System.out.println("There is no such pair");
				return "There is no such pair";
			}
			else
			{
				System.out.println("The pairs are present in the array");
				return "The pairs are present in the array";
			}
		}
	}
	
	public static void verifyResult(String actual,String expected) {
		Assert.assertEquals(actual, expected);
	}
}
