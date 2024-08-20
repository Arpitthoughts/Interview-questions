package Test;

public class ReverseStringWithoutChangingSecondLast {

	public static void main(String[] args) {

		String input = "Independence";
		// output enednepedncI

		// methodOne(input);
		methodTwo(input);

	}

	private static void methodTwo(String input) {
		// output enednepedncI
		int n = input.length();
	    char[] carr = input.toCharArray();
	    StringBuilder result = new StringBuilder();

	    for (int i = carr.length - 1; i >= 0; i--) {
	        if (i == n - 2) {
	            continue; // Skip the second-to-last character
	        } else {
	            result.append(carr[i]);
	        }
	    }
	    // Insert the second-to-last character back to its original position
	    result.insert(n - 2, carr[n - 2]);
	    System.out.println(result);
	}

	private static void methodOne(String input) {
		int n = input.length();
		char[] carr = input.toCharArray();
		int left = 0, right = n - 1;
		while (left < right) {
			if (right != n - 2) {
				char temp = carr[right];
				carr[right] = carr[left];
				carr[left] = temp;
				left++;
				right--;
			} else {
				right--;
			}

		}
		System.out.println(new String(carr));
	}

}
