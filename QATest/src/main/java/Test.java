import java.util.Arrays;

public class Test {
					
					
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortTheArray(new String[] {"hello","Innovation","hi","java"});
	}
	
	public static void sortTheArray(String[] str) {
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[j].length()<str[i].length()) {
					String temp =str[j];
					str[j]=str[i];
					str[i]=temp;
				}
			}
		}
		
		System.out.println("Sorted Array : "+Arrays.toString(str));
	}
	
	

}
