package DP;

import java.util.Arrays;

public class InterviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res=reverse("thi is string test");
		System.out.println(res);
	}	
	
	public static String reverse(String str){
		int i=0;
		int j= str.length()-1;
		char[] arr=str.toCharArray();

		while(i<j){
			if(str.charAt(i)==' '){
			
			i++;
			continue;
			}
			if(str.charAt(j) == ' '){
			j--;
			continue;
			}
			
			char temp = arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		return String.valueOf(arr);
		}
}
