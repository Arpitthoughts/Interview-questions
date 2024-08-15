package Test;

public class findshortestandlongestword {

	public static void main(String[] args) {
		String words = "this is example for finding longest and shortest word";

//shortest = is
//largest = shortest

		String shortest = words.split(" ")[0];
		int shortestLength = shortest.length();

		String largest = words.split(" ")[0];
		int LargestLength = largest.length();

		for (String s : words.split(" ")) {

			int current = s.length();
			if (current < shortestLength) {
				shortest = s;
				shortestLength = current;
			}

			if (current > LargestLength) {
				largest = s;
				LargestLength = current;
			}
		}

		System.out.println(shortest);
		System.out.println(largest);

	}

}
