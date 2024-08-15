
package Test;

import java.util.Arrays;

public class movenegativestoend {

	public static void main(String[] args) {

		
		int[] nums= {1,-1,3,-2,-3,5,6,-7};
		//output={-1,-2-3-7,1,3,5,6}
		
		moveNegativesToLeft(nums);
		
	}
	
	 private static void moveNegativesToLeft(int[] nums) {
	      
		 int index=0;
		 int brr[] = new int[nums.length];
		 for(int i=0;i<nums.length;i++) {
		
			 if(nums[i]<0) {
				 brr[index++]= nums[i];
			 }
			 
		 }
		 
		 for(int i=0;i<nums.length;i++) {
				
			 if(nums[i]>0) {
				 brr[index++]= nums[i];
			 }
			 
		 }
		 System.out.println(Arrays.toString(brr));
	    }

}
