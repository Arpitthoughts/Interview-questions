package NaturalSortingOfCustomClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements  Comparable<Employee>{

	String name;
	int age;

	Employee(String name, int age) {

		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee name = " + this.name + " " + "age = " + this.age;

	}
	
	@Override
	public int compareTo(Employee o) {
		//return this.age-o.age ; sort by age
		return this.name.compareTo(o.name);
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Rahul", 25);
		Employee e2 = new Employee("Zubair", 38);
		Employee e3 = new Employee("Kumble", 42);
		Employee e4 = new Employee("Akhil", 21);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		System.out.println(employees);

		Collections.sort(employees);
		

		System.out.println(employees);
	}

	
}
