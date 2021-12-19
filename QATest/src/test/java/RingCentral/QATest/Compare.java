package RingCentral.QATest;

import java.util.*;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
		tree.add(12);
		tree.add(14);
		tree.add(5);
		tree.add(88);
		tree.add(9);
		
//		TreeSet<StringBuffer> tree2 = new TreeSet<>();
//		tree2.add(new StringBuffer("user1"));
//		tree2.add(new StringBuffer("user1"));
		
		TreeSet<Employee> tree2 = new TreeSet<>();
		tree2.add(new Employee(1,"shad"));
		tree2.add(new Employee(1,"shad"));
		
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(1,"shad"));
		set.add(new Employee(1,"shad"));
		
		System.out.println(set.size());
		System.out.println(tree);
	}
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		return -i1.compareTo(i2);
	}
	
}

class Employee implements Comparable{
	
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	int salary;
	 String name;
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e= (Employee)o;
		if(this.salary == e.salary && this.name.equals(e.name)){
			return 0;
		}else if(this.salary > e.salary)
			return 1;
		else
			return 0;
	}
	
}


