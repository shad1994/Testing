import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result(new int[] {1, 2, 2,2,3, 4, 5,5, 3});
	}
	
	public static void result(int [] n) {
		
		List<Integer> output1=new ArrayList<Integer>();
		List<Integer> output2=new ArrayList<Integer>();
        
        for(int i=0;i<n.length-1;i++){
            if(n[i]==n[i+1]){
                output1.add(n[i]);
                while(n[i]==n[i+1]) {
                	output1.add(n[i]);
                	i++;
                }
            }else{
                output2.add(n[i]);
            }
        }
        if(n[n.length-1]!=n[n.length-2]) {
        	output2.add(n[n.length-1]);
        }
        System.out.println(output1);
        System.out.println(output2);
	}

}
