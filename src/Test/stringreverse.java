package Test;

public class stringreverse {

	public static void main(String[] args) {
	
	String str="My name is arpit";
	String firstWord=str.substring(0, str.indexOf(" "));
	System.out.println(firstWord);
	
	String lastWord=str.substring(str.lastIndexOf(" ")).trim();
	System.out.println(lastWord.trim());
	String reverse="";
	
	for(String s:str.split(" ")) {
		
		if(s.equals(firstWord)||s.equals(lastWord)) {
			StringBuilder sb= new StringBuilder(s);
			reverse=reverse+sb.reverse().toString()+" ";
		}
		else {
			reverse=reverse+s+" ";
		}
	}
	System.out.println(reverse);
	
	
	
	}
}
