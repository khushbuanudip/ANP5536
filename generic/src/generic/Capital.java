package generic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee("Radhika",24567.4f));
		emp.add(new Employee("Shreya",34567.4f));
		emp.add(new Employee("Sneha",14567.4f));
		Collections.sort(emp);
		for(Employee e:emp)
		{
			System.out.println("Name of employee"+e.getEname()+"Salary"+e.getEsalary());
		}
		
	}

}
class Employee implements Comparable<Employee>
{
	private String ename;
	private float esalary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	public Employee(String ename, float esalary) {
		super();
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.esalary<o.esalary)
			return 1;
		else if(this.esalary>o.esalary)
			return -1;
		else
		return 0;
	}
}
class Student implements Comparable<Student>
{
	String name;
	int age;
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.age >o.age)
			return 1;
		else if(this.age<o.age)
			return -1;
		return 0;
	}
}