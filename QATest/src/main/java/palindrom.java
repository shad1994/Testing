import java.util.HashMap;
import java.util.Map;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPalindrom("nnitt")) {
			System.out.println("It is a palindrom");
		}else
			System.out.println("Not a palindrom");
	}

	public static boolean isPalindrom(String str) {
		Map<Character,Integer> map = calculateOccurances(str);
		boolean oddFlag=false;
		boolean isPalindrom = true;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()%2==0) {
				continue;
			}else if(entry.getValue()%2 !=0) {
				if(oddFlag) {
					isPalindrom =false;
					break;
				}
				oddFlag=true;
			}
		}
		return isPalindrom;
	}
	
	public static Map<Character,Integer> calculateOccurances(String s){
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else
				map.put(s.charAt(i), 1);
		}
		return map;
	}
}
