package CustomSortingUsingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTelegram {

	public String name;
	public int age;
	public String group;

	public EmployeeTelegram(String name, int age, String group) {
		this.name = name;
		this.age = age;
		this.group = group;
	}

	public String toString() {
		return "name= " + this.name + " age = " + this.age + " group =" + this.group;

	}

	public static void main(String[] args) {

		EmployeeTelegram e1 = new EmployeeTelegram("Rahul", 27, "First Year");
		EmployeeTelegram e2 = new EmployeeTelegram("Raj", 22, "Second Year");
		EmployeeTelegram e3 = new EmployeeTelegram("Ram", 21, "First Year");
		EmployeeTelegram e4 = new EmployeeTelegram("Ram", 23, "Second Year");

		List<EmployeeTelegram> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		System.out.println("before sorting");
		System.out.println(al);
		Collections.sort(al, new EmployeeTelegramComparator());
		System.out.println("after sorting");

		System.out.println(al);

	}
}
