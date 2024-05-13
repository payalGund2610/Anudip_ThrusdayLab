package Enumration;

public class Enum_Demo 
{

	public static void main(String[] args) 
	{
		Student s1 = Student.payal;
		switch(s1)
		{
			case mayuri:
				System.out.println("Class and object");
				break;
			case Shubham:
				System.out.println("Class ");
				break;
			default:
				System.out.println("Invalid Choice");
		}

	}

}
