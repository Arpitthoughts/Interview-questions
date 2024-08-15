package Test;

import java.util.Arrays;

public class findmissingnumber {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 7, 5, 2 };
		int n = 7;

		// int missingnum = usingBruteForce(arr, n);
		int missingnum = usingsummethod(arr, n);
	System.out.println(usingHashing(arr, n));
		//System.out.println(missingnum);

	}

	private static int usingHashing(int[] arr, int n) {

		int brr[]=  new int[n+1];
		
		for(int num : arr) {
			brr[num]=1;
		}
	

	for(int i = 1;i<=n;i++)
	{
		if (brr[i]==0) {
			return i;
		}
	}
	return -1;
	}

	private static int usingsummethod(int[] arr, int n) {

		int totalSum = n * ((n + 1) / 2);

		int arraysum = 0;

		for (int i = 0; i < arr.length; i++) {
			arraysum = arraysum + arr[i];

		}

		return totalSum-arraysum;
	}

	private static int usingBruteForce(int[] arr, int n) {

		for (int i = 1; i <= n; i++) {

			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {

				if (arr[j] == i) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				return i;
			}
		}
		return n;

	}

}
