package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListConversion {

	public static void main(String[] args) {
		String [] arr= {"Ashok","Sanjeev","Rajeev"};
	
		//Conversion Array to List using asList()
		
		List al=Arrays.asList(arr);
		System.out.println(al);

		//Conversion of Array to List by creating new array
		List<String> bl = new ArrayList<String>(Arrays.asList(arr));
		
		bl.add("Manoj");
		System.out.println(bl);
		
		
		//Conversion of Array to List by Collections.addAll()
		
		List<String> cl = new ArrayList<>();
		Collections.addAll(cl, arr);
		System.out.println(cl);
		
		
		//Conversion of ArrayList back to Array by toArray()
	String[] crr=cl.toArray(new String[cl.size()]);
		System.out.println(Arrays.toString(crr));
		
		
		//Another method using streams
		
		List<Integer> numlist=List.of(5,3,5,6,7);
		List<Integer> numarr=numlist.stream().filter(s->(s>5)).collect(Collectors.toList());

		System.out.println(numarr);
		
		
		
		
		List<Integer>av=List.of(10,44,22);
//	int[] arr1=av.stream().mapToInt(Integer::intValue).toArray();

		
		
		

	}

}
