package Test;

import java.util.ArrayList;
import java.util.List;

public class nonrepeatedcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //String str = "Today is a Good Day";
	       /*Write a program to find all the non-repeated characters from the sentence.
	Output: TisGD*/
	    
	 /*   StringBuilder sb = new StringBuilder();
	    System.out.println(str.indexOf('o'));
	    System.out.println(str.lastIndexOf('o'));
	    
	    //1st Method
	    for(char i : str.toCharArray()) {
	    	
	    	if(str.indexOf(i)==str.lastIndexOf(i)) {
	    		sb.append(i);
	    	}
	    }
	    System.out.println(sb);*/
	    
	    //2nd Method
	    
	    
	    String str="Today is a Good Day";
	    char [] st1=str.toCharArray();
	    int xvisit[]= new int[st1.length];
	    int count=0;
	    int f=-1;
	    for(int i=0;i<st1.length;i++) {
	    	count=1;
	    	for(int j=i+1;j<st1.length;j++) {
	    		if(st1[i]==st1[j]) {
	    			count+=1;
	    			xvisit[j]=f;
	    		}
	    	}
	    	
	    	if(xvisit[i]!=f) {
	    		xvisit[i]=count;
	    	}
	    	
	    }
	    
	    for(int k=0;k<xvisit.length;k++) {
	    	if(xvisit[k]!=f && xvisit[k]==1) {
	    		System.out.print(st1[k]);
	    	}
	    }
	    
	}

}
