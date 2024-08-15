package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class adobeq1 {

	public static void main(String[] args) {

		/*
		 * 1. Given a list of integers and a target sum, write a function to find the
		 * indices of the two numbers in the list that add up to the target sum. You may
		 * assume that each input would have exactly one solution, and you may not use
		 * the same element twice. Example: int[] nums = {3, 2, 4} target=6; Output: [1,
		 * 2]
		 */
		int[] nums = { 3, 2, 4 };
		/*List<Integer> indices = usingBruteForce(nums, 6);
		System.out.println(indices);
		*/
		
		
		
	 int arr[]=findTwoSum(nums, 6);

	 System.out.println(arr[0]+"  "+arr[1]);
	

	}

	private static List<Integer> usingBruteForce(int[] nums, int n) {

		
		List<Integer> indices = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {


				if ((nums[i] + nums[j]) == n) {
					indices.add(i);
					indices.add(j);

					return indices;

				}
			}

		}
		return indices;

	}
	
	
	
	
	private static int[] findTwoSum(int[] nums, int target) {
		
		// int [] nums = { 3, 2, 4 };
		//target =6
 Map<Integer,Integer> hm = new HashMap<> ();
 
 for(int i=0;i<nums.length;i++) {
	 
	 int complement = target-nums[i];
	 
	 
if(hm.containsKey(complement)) {
	
	return new int[] {i, hm.get(complement)};
}

hm.put(nums[i], i);

	 
		
	 
 }
return null;
}
}