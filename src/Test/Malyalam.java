package Test;

import java.util.HashSet;
import java.util.Set;

public class Malyalam {

	public static void main(String[] args) {
		String str = "malayalam";

		
		Set<String>strings=new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <=str.length(); j++) {
				String s = str.substring(i, j);
				//System.out.println(s);
				String res=isPallindrome(s.toLowerCase());
				if(res!=null ){
				strings.add(res);
				}
			}
		
		}
		System.out.println(strings);
	}

	private static String isPallindrome(String s) {
	
		int l = 0, r = s.length() - 1;
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return null;
			}
			l++;
			r--;
		}
		return s;
	}

}
