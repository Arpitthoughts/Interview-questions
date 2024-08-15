package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DruvaAssessmentQ1 {

	/*
	 * Input: new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"} Output:String->
	 * B:3,Y:1 Input: new String[] {"Z:0", "A:-1"} Output: String -> A:-1 
	 * Note ->Key with value 0 will not be included in the result String
	 */

	public static void main(String[] args) {
		String strArr[] = new String[] { "X:-1", "Y:1", "X:-4", "B:3", "X:5","C:1" };
		Solution(strArr);

	}

	private static void Solution(String[] strArr) {
		StringBuilder result = new StringBuilder();
		Map<String, Integer> hm = new HashMap<>();

		for (String s : strArr) {

			String key = s.split(":")[0];
			int value = Integer.parseInt(s.split(":")[1]);

			if (hm.containsKey(key)) {

				hm.put(key, hm.get(key) + value);
			} else {

				hm.put(key, value);
			}

		}
		
	for(Entry<String,Integer> entry:	hm.entrySet()) {
		if(entry.getValue()!=0) {
			
			if(result.length()>0) {
			result.append(",");
			}


				result.append(entry.getKey()).append(":").append(entry.getValue());
			
		}
	}

	System.out.println(result);
	}

}
