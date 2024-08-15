package Test;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		// input
		int arr[] = { -1, 9, 0, 4, 3, 0, 1, 2, 0 };
		// output {-1,9,4,3,1,2,0,0,0};
		int i = 0, j = 0;

		while (i < arr.length) {

			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else {
				i++;
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}