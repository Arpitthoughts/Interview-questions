package Test;

import java.util.Arrays;

public class CountMaxConsecutiveOccurrOf1 {

	public static void main(String[] args) {
//input
		int[] arr = { 1, 1,0, 2, 3, 1, 1, 1, 6, 1, 1 };
		int count = 0;
		int maxcount = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1) {
				count++;
				if (count > maxcount) {
					maxcount = count;
				}
			} else {
				
				count = 0;
			}
		}
		System.out.println(maxcount);
	}

}
