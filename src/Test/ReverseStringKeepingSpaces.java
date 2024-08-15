package Test;

public class ReverseStringKeepingSpaces {
	  public static void main(String args[]) {
	    
	    String input="i am arpit";
	    //output t ip ramai
	    int len=input.length()-1;
	    int startIndex=0;
	    String result="";
	    char[] inputarr = input.toCharArray();
	    while(len>=0){
	    
	    if(inputarr[startIndex]!=' '){
	            if(inputarr[len]!=' ')   {
	                result=result+inputarr[len];
	                startIndex++;
	                len--;
	            } 
	            else{
	                len--;
	            }
	    }
	    else{
	        result=result+' ';
	        startIndex++;
	    }
	    
	  }
	  
	  System.out.println(result);
	}

	    
	}