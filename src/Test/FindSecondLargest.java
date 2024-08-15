package Test;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr = { 1,4,3,5,6 };
		// System.out.println(firstWayToFindSecondLargest(arr)); //time complexity -> Nlogn+N;
		// SecondWayToFindSecondLargest(arr); //time complexity -> N+N =2N
		ThirdWayToFindSecondLargest(arr); //time complexity = N
	}

	private static void ThirdWayToFindSecondLargest(int[] arr) {

		if(arr==null || arr.length==1 ) {
			System.out.println("second Largest "+arr[0]);
			return;
		}
		
		int largest=arr[0]; int secondLargest=-1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];		
			}
			else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("second Largest is = "+secondLargest);
	}

	private static int firstWayToFindSecondLargest(int[] arr) {
		Arrays.sort(arr);

		int n = arr.length;

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] != arr[n - 1]) {
				return arr[i];
			}
		}
		return n;
	}

	private static void SecondWayToFindSecondLargest(int[] arr) {

		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] != largest && arr[j] > secondLargest)
				secondLargest = arr[j];
		}
		System.out.println("secondLargest = " + secondLargest);

	}

}
