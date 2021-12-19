package paytm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterviewTest {

	public static void main(String[] args) {
		countStrings("This this is is done by Saket Saket");
		swap(3, 4);
	}
	
	//count the number of words in a string using hashmap
	//This this is is done by Saket Saket
	
	public static void countStrings(String str) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("The occurance of String : " +entry.getKey() +" is : "+entry.getValue());
		}
	}
	
	//swap two numbers without using third variable
	public static void swap(int a,int b) {
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("a is now : "+a+" b is now : "+b);
	}
	
}
