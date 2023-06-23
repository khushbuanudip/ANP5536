package generic;

public class Hello {
	
	public static void checkAge(int num) throws Exception
	{
		
		if(num<18)
		{
			throw new Ageerror("invalid entry");
		
		}
		else
		{
			System.out.println("You are welcome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.print("hello world");
     try {
		checkAge(19);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
