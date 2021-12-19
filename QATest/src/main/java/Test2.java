import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("ab-C-DEfG-x");
	}
	// ab-C-DEfG-x      xG-f-EDCb-a
	
	public static void reverseString(String str) {
		
		char[] arr=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(arr[i]=='-') {
				i++;
				continue;
			}
			if(arr[j] == '-') {
				j--;
				continue;
			}
			char temp= arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));		
	}
}
