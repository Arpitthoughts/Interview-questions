package Test;

import java.util.Arrays;

public class Zerotoend {

	public static void main(String[] args) {

		int arr[]= {1,0,0,2,0,6,1,1,0,4,5,6};
		//output 1,2,6,1,1,4,5,6,0,0,0;
		
		int nz=0,z=0;
		while(nz<arr.length) {
			
			if(arr[nz]!=0) {
				
				int temp= arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				nz++;
				z++;
			}
				else {
					nz++;
				}
			}
			
		System.out.println(Arrays.toString(arr));
		
	}

}
