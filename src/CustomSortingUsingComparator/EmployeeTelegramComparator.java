package CustomSortingUsingComparator;

import java.util.Comparator;

public class EmployeeTelegramComparator implements Comparator<EmployeeTelegram> {

	@Override
	public int compare(EmployeeTelegram o1, EmployeeTelegram o2) {

		int name=o1.name.compareTo(o2.name);
		int age=o1.age-o2.age;
		return (name==0)?age:name;
	}

}
