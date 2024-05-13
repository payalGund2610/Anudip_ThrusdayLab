package Ploymorphism_overriding;
public class override 
{
	public static void main(String[] args) 
	{
		sum_of_numbers obj=new sum_of_numbers();
		sum_of_numbers obj1=new add_of_numbers();
		obj.accept_no();
		obj1.accept_no();
	}
}

