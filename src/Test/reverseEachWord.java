package Test;

public class reverseEachWord {

	public static void main(String[] args) {
		
		
		String input="Java code";
		String reverseinput="";
		
		String[] words=input.split(" ");
		
		for(String word : words ) {
			String rev="";
			
			for(int i =word.length()-1;i>=0;i--) {
				
				 rev = rev+word.charAt(i);
			}
			reverseinput= reverseinput+rev+" ";
			
		}
		System.out.println(reverseinput.trim());

	}

}
