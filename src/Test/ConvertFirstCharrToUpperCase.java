package Test;

import java.util.Arrays;

public class ConvertFirstCharrToUpperCase {
    public static void main(String args[]) {
     
     String s1="my name is abc";    
    //output="Abc Is Name My"
    
    String[] str=s1.split(" ");
    String result="";
    
    for(int i=str.length-1;i>=0;i--){
        
        String curr=str[i];
        
        char first=Character.toUpperCase(curr.charAt(0));
 
        
        char[] currarr= curr.toCharArray();
        currarr[0]=first;
      
        if(result.length() >0) {
        	result=result+" ";
        }
         result=result+new String(currarr);
         
         
     } 
     
     System.out.println(result);
    }
}
        
        
        
    
        
        
    
