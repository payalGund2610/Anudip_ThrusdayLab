package thrusday_28_lab;

public class Customer extends Service_Center_Details // subclass extends superclass
{
	private int Cus_Adhar_no;
	public int Cus_Phone_no;
	private String Cus_Password;
	public String Cus_Name;
	// encapsulation
	public String getCus_Password() 
	{
		return Cus_Password;
	}

	public void setCus_Password(String cus_Password) 
	{
		Cus_Password = cus_Password;
	}

	public int getCus_Adhar_no()
	{
		return Cus_Adhar_no;
	}
	
	public void setCus_Adhar_no(int cus_Adhar_no) 
	{
		Cus_Adhar_no = cus_Adhar_no;
	}
	
}
