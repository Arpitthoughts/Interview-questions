package Test;

public class a2b2c3 {

	public static void main(String[] args) {

		String str = "a2b2c3d4";
		//output aabbcccdddd
		StringBuilder result = new StringBuilder();
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {

			if (Character.isLetter(arr[i])) {
				result.append(arr[i]);

			} else {
				int digit = Character.getNumericValue(arr[i]);
				for (int j = 1; j < digit; j++) {
					result.append(arr[i-1]);
				}
				
			}
		}
		System.out.println(result);

	}

}
