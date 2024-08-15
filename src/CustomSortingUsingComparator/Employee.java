package CustomSortingUsingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

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

	public static void main(String[] args) {

		Employee e1 = new Employee("Rahul", 25);
		Employee e2 = new Employee("Zubair", 38);
		Employee e3 = new Employee("Akhil", 42);
		Employee e4 = new Employee("Akhil", 21);
		

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		System.out.println(employees);
//sorting using name comparator
//		Collections.sort(employees, new NameComparator());



		// sorting using age comparator
	//	Collections.sort(employees, new AgeComparator());
		
		
		//multilevel sorting when name is same or age is same
		
		Collections.sort(employees, new MultilevelSorting());
		System.out.println(employees);
		
		
		
	}

}
