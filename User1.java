package encapsulation;

public class User1 {

	public static void main(String[] args) 
	{
		
		Bank_Operation BO= new Bank_Operation();
		BO.Accept_details();
		BO.display_data();
		BO.transaction();
		
	}

}
