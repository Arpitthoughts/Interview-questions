package Test;

public class splitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Output java 
		  string split method 
		   javatpoint
		 */
		String s1="java by string split method by javatpoint";  
		String[] words=s1.split("by",2);//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  

	}

}
