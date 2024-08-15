package Test;

import java.util.Arrays;

public class FindLargestInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 5, 6 };

		findSmallest(arr);
		findLargest(arr);
	}

	private static void findSmallest(int[] arr) {

		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("smallest = " + smallest);
	}

	// optimal solution
	private static void findLargest(int[] arr) {
		int largest = arr[0];
		int complexity = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
			complexity++;
		}
		System.out.println("largest = " + largest);

	}

}
