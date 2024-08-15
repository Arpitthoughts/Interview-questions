package Test;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 29;

		isPrime(num);

	}

	private static void isPrime(int num) {
		boolean flag = true;
		if (num <= 1)
			flag = false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Number is prime " + num);
		} else {
			System.out.println("Number is not prime " + num);

		}
	}

}
