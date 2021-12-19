package GlobalLogic;

public class CustomException {

	// [2,5,3,1,6,12]
	public static void main(String[] str) {
		int minJumps;
		try {
			minJumps = minJumps(new int[] { 2, 5, 5, 1, 6, 12 });
			System.out.println(minJumps);
		} catch (custom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

	public static int minJumps(int[] n) throws custom {

		int i = 0;
		int jump = 0;
		int length = n.length;
		if (n[0] == n.length - 1) {
			return 1;
		} else {
			int sum = 0;
			while (i < n.length - 1) {
				if (n[i] == 0) {
					return -1;
				}
				sum = sum + n[i];
				jump++;
				if (sum + 1 == length) {
					return jump;
				}
				i = i + n[i];
			}
		}
		if (i >= length) {
			custom exception = new custom();
			throw exception;
			//return -1;
		}
		return -1;
	}
}

class custom extends Exception {

	custom(){
		super("The array out of bound");
	}

}

class A{
	
private static A obj;

private A() {};

public synchronized A getInstance() {
	if(obj == null) {
		obj = new A();
	}
	return obj;
	
}
}

enum B{
	
	INSTANCE;
}
