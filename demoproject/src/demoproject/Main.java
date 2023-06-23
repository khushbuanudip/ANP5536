package demoproject;


		// TODO Auto-generated method stub
		import java.util.ArrayList;
		import java.util.*;
		class Container<T>
		{
			T value;
		public void	show()
		{
			System.out.println(value.getClass().getName());
		}
					
		}

		public class Main {

			public static void main(String[] args) {
				
				
			   TreeSet<Integer> number=new TreeSet<Integer>();
			   number.add(10);
			   number.add(5);
			   number.add(55);
			   number.add(40);
			   number.add(55);
			   for(Integer n:number)
			   {
				   System.out.println(n);
			   }
				ArrayList<Student> sdata=new ArrayList<>();
               sdata.add(new Student("Nishant"));
               sdata.add(new Student("Ravi"));
               sdata.add(new Student("pooja"));
               sdata.add(new Student("Zalak"));
               Collections.sort(sdata);
               for(Student s:sdata)
               {
            	   System.out.println("id"+s.getId()+"name"+s.getName());
               }
			}

		
			}

		
      class Student implements Comparable<Student>
      {
    	  private int id;
    	  private String name;
    	  public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	/*	public int compareTo(Student s)
    	  {
    		  if(id==s.id)
    			  return 0;
    		  else if(id>s.id)
    			  return 1;
    		  else
    			  return -1;
    		  
    	  }*/
		public int compareTo(Student s)
  	  {
			return this.name.compareToIgnoreCase(s.name);
  	  }
		public Student( String name) {
		
			
			this.name = name;
		}
		public Student() {
	
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
      }

	