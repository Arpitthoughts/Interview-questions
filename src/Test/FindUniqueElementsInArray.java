package Test;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueElementsInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 8, 8, 8, 9 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Unqiue element = " + arr[i]);
			}
		}

	}

}
