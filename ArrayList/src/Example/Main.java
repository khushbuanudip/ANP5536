package Example;
import java.util.*;
/*
 * Make arraylist of programming language “java’,”R”,”python”,”java script”, ” “,”c”.print arraylist up to blank string

 */
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Tejas","Java Full stack",90);
		s1.display();
		
		
}
	

}
class Human
{
	int aid;
	String name;
	
	Human(int i,String n)
	{
		aid=i;
		name=n;
	}
}

class Student extends Human
{
	String coursename;
	int marks;
	Student(int id,String n,String cname,int m)
	{
		super(id,n);
		coursename=cname;
		marks=m;
		
	}
	public void display()
	{
		System.out.println("id:"+super.aid+"name"+super.name+"course name"+coursename+"Marks"+marks);
	}
	
}