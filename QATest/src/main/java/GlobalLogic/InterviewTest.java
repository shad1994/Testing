package GlobalLogic;

import java.util.HashSet;
import java.util.Set;

public class InterviewTest {

	public static void main(String[] args) {
		// result("My name is Shadab");
		//countOccurance("MynameisShadab");
		sort("MynameisShadab");
	}
	public static void sort(String str) {
		char [] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(((Character)arr[i]).compareTo((Character)arr[j])<0){
					char c= arr[i];
					arr[i]=arr[j];
					arr[j] = c;
				}
			}
		}
		System.out.println(String.valueOf(arr));
	}

	public static void result(String str) {
		String[] s = str.split(" ");
		for (String s1 : s) {
			System.out.print(reverse(s1) + " ");
		}
	}

	public static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}

	public static void countOccurance(String str) {
		int count = 1;
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			int j = i + 1;
			if (set.add(str.charAt(i)) || str.charAt(i)!=' ') {
				for (; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				System.out.println("The occurance of " + str.charAt(i) + " is " + count);
				count = 1;
			}
		}
	}

}
