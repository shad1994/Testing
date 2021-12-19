package Siemens;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InterviewTest {

	public static void show() {
		System.out.println("parent class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "mcnadgABBBAAABCCmcnadgCCLMNCAAABBCCmcnadg";
		//countChars(S1);
		findResult("Automation");
		InterviewTest i = new Child();
		Child c= (Child)i;
		c.show();
	}

//	public static void countChars(String str) {
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C') {
//				if (map.containsKey(str.charAt(i)))
//					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//				else
//					map.put(str.charAt(i), 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println("The occurance of "+entry.getKey()+" is "+entry.getValue());
//		}
//	}

	public static void findResult(String s) {
		String str  = s.toLowerCase();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
				if (map.containsKey(str.charAt(i)))
					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				else
					map.put(str.charAt(i), 1);
			}
		int count=1;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1)
			{
				if(count==2)
					System.out.println(entry.getKey());
				count++;
			}
		}
	}
	
}

class Child extends InterviewTest{
	public static void show()
	{
		System.out.println("child class");
	}
}


