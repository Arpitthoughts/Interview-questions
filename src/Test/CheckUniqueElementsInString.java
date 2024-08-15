package Test;

public class CheckUniqueElementsInString {

	public static void main(String[] args) {
		String name = "java";
	System.out.println(usingCharAtMethod(name));
	}

	private static boolean usingCharAtMethod(String name) {
		boolean Unique=false;
		char[] arr = name.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			int index = name.indexOf(arr[i], i + 1);
			if (index == -1) {
				Unique=false;;
				
			}
			else {
				Unique=true ;
				return Unique;
			}
		}
		return Unique;
	}

}
