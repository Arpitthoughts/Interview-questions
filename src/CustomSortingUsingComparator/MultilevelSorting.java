package CustomSortingUsingComparator;

import java.util.Comparator;

public class MultilevelSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int name = o1.name.compareTo(o2.name);
		int age = o1.age - o2.age;

		return (name == 0) ? age : name;
	}

}
