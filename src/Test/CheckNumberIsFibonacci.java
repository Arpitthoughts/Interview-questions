package Test;

public class CheckNumberIsFibonacci {

	public static void main(String[] args) {
		int n = 13;
		System.out.println(isFibonacci(n));
	}

	private static boolean isFibonacci(int n) {
		int a = 0, b = 1, c = 0;

		if (n == a || n == b) {
			return true;
		}

		c = a + b;
		while (c <= n) {
			if (c == n) {
				return true;
			}

			a = b;
			b = c;
			c = a + b;
		}
		return false;

	}

}
