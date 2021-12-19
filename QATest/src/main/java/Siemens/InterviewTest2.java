package Siemens;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterviewTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11aabb11ccaa
		countOccurance("11aabb11ccaa");
	}
	
	public static void countOccurancess(String str) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i), 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("The occurance of "+entry.getKey()+" is "+entry.getValue());
		}
	}
	
	public static void countOccurance(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		int count =1;
		int i=0;
		for(;i<arr.length-1;i++) {
			if(arr[i] == arr[i+1])
				count++;
			else {
				System.out.println("The occurance of "+arr[i]+" is "+count);
				count=1;
			}
		}
		System.out.println("The occurance of "+arr[i]+" is "+count);
	}

}
