package Test;

public class ReverseWords {
	  public static void main(String args[]) {
	    		String input = "I love my country";
	            String result="";
	    //output I evol ym yrtnuoc
	    
	    String[] inputarr=input.split(" ");
	    for(String s : inputarr){
	        
	        if(result.length() > 0){
	            result=result+" ";
	        }
	        result=result+reverseWord(s);
	        
	    }

	    System.out.println(result);

	  }
	  
	  private static String reverseWord(String str){
	      
	      int l=0;
	      int r=str.length()-1;
	      char[] arr=str.toCharArray();
	      while(l<r){
	          
	          char temp=arr[r];
	          arr[r]=arr[l];
	          arr[l]=temp;
	          l++;
	          r--;
	      }
	      return new String(arr);
	  }
	}
