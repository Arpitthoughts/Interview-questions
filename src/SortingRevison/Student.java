package SortingRevison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	String name;
	int age;
	String div;

	Student(String name, int age, String div) {
		this.name = name;
		this.age = age;
		this.div = div;

	}

	public String toString() {
		return "name=" + this.name + " " + "age=" + this.age + " " + "div=" + this.div;
	}

	
	@Override
	public int compareTo(Student o) {
	 int name=this.name.compareTo(o.name);
	 int age= this.age-o.age;
	 
	 return (name==0)?age:name;
	}
	
	public static void main(String[] args) {

		Student s1 = new Student("Zyan", 20, "first year");
		Student s2 = new Student("Raj", 22, "second year");
		Student s3 = new Student("Ram", 21, "first year");
		Student s4 = new Student("Ram", 23, "second year");

		List<Student> al = new ArrayList<>(List.of(s1, s2, s3, s4));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);

	}

	
}
