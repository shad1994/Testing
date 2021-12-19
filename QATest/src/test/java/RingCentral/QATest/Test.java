package RingCentral.QATest;

public class Test {

	public static void main(String[] args) {

		System.out.println(sum(001));
	}

	static int sum;

	public static int sum(int n) {
		if (n < 10) {
			return n;
		} else {
			sum=0;
			while (n > 0) {
				sum = sum + n % 10;
				n = n / 10;
			}
			sum(sum);
		}
		return sum;
	}

}
