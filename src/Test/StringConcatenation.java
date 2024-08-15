package Test;

import java.util.Arrays;

public class StringConcatenation {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="World";
		String s3=s1+s2;
		System.out.println(s3);
		
		s3.intern();
		String s4="HelloWorld";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		String s5= new String("VScode");
				String s6=s5.intern();
				System.out.println(s5==s6);
		
		String pop="xXHello NaveenxXXAutomationXXXLabsXXXXJava";
				String[] p=pop.split("xX");
				System.out.print(p[0] + ":" + p[0].length());
				
				System.out.println(Arrays.toString(p));

	}

}
