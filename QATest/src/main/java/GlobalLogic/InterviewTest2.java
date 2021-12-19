package GlobalLogic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class InterviewTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee(25, "M");
		Employee e2=new Employee(25, "M");
		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
//		if(e1.equals(e2)) {
//			set.add(e1);
//		}else {
//			set.add(e1);
//			set.add(e2);
//		}
		
//		if(set.add(e1)) {
//			System.out.println("e1 is inserted");
//		}
//		if(set.add(e2)) {
//			System.out.println("e2 is inserted");
//		}
		System.out.println(set.size());
//		if(e1.equals(e2)) {
//			
//		}
	}

}

class Employee{
	
	
	int age;
	String sex;
	Employee(int age, String sex){
		this.age=age;
		this.sex=sex;
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
		if (age != other.age)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}


//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Employee e=(Employee) o;
//		if(this.age == e.age && this.sex.equals(e.sex)) {
//			return 0;
//		}else if(this.age > e.age) {
//			return +1;
//		}else
//			return -1;
//	}


//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
