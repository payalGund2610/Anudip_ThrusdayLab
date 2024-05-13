package thrusday_28_lab;

public class Automobile_Service 
{ //Main class 
	public static void main(String[] args) 
	{
		Payment sb = new Payment();// create object of child class
		// call all methods of parents classes
		sb.CarOwner();
		sb.Service();
		sb.Total_Bill();
		sb.Pay();
	}
}
