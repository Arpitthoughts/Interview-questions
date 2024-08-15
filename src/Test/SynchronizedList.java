package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {

	public static void main(String[] args) {

		List<String> al = Collections.synchronizedList(new ArrayList<>());
		
		al.add("one");
		al.add("two");
		al.add("three");

		synchronized (al) {

			for (String s : al) {
				System.out.println(s);
			}
		}
	}

}
