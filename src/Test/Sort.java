package Test;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		int arr[] = { 0,1,-1,0,1,1,-1};
		//output arr = [-1,-1, 0,0, 1, 1, 1]
			
	
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[i]) {
					int temp =arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		
		
		System.out.println(Arrays.toString(arr));

	}
	
	
	
	

}
