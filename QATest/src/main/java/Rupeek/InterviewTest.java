package Rupeek;

public class InterviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("user1");
		String s2= new String("user1");
		String s3 = "user1";
		Object obj1 = new String("\"I'm string\"");
		Object obj2 = new String("\"I'm string\"");
		if (obj1 == obj2) {
			System.out.println("pass");
		}else
			System.out.println("Fail");
		if (s1 == s2) {
			System.out.println("pass");
		}else
			System.out.println("Fail");
	}

}
