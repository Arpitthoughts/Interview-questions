package Test;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 8, 9 };

		//rotatearrayleftbyonepostion(arr);
		// rotatearrayleftbyspecificpostion(arr, 16);
		 rotatearrayrightbyspecificpostion(arr, 17);  //output = {9,2,5,7,8}
		//rotatearrayleftusingreverseapproach(arr, 2);
	}

	private static void rotatearrayrightbyspecificpostion(int[] arr, int d) {
		
		int rotatedarr[] = new int[arr.length];
		d=d%(arr.length);
		int index=0;
		int n=arr.length;
		for(int i=n-d;i<n;i++) {
			rotatedarr[index++]=arr[i];
		}
		
		for(int i=0;i<n-d;i++) {
			rotatedarr[index++]=arr[i];
		}
		System.out.println(Arrays.toString(rotatedarr));
		
		
	}

	private static void rotatearrayleftbyspecificpostion(int[] arr, int d) {

		d = d % (arr.length);

		int temp[] = new int[arr.length];
		int index = 0;
		for (int i = d; i < arr.length; i++) {
			temp[index++] = arr[i];
		}

		for (int i = 0; i < d; i++) {
			temp[index++] = arr[i];
		}
		System.out.println(Arrays.toString(temp));

	}

	private static void rotatearrayleftbyonepostion(int[] arr) {

		int temp = arr[0];

		for (int i = 1; i < arr.length; i++) {

			arr[i - 1] = arr[i];
		}

		arr[arr.length - 1] = temp;
		System.out.println(Arrays.toString(arr));
	}

	private static void rotatearrayleftusingreverseapproach(int[] arr, int d) {

		reverseArrayElements(0, d - 1, arr);
		reverseArrayElements(d, arr.length - 1, arr);
		reverseArrayElements(0, arr.length - 1, arr);

		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArrayElements(int start, int end, int arr[]) {

		while (start <= end) {

			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}

}
