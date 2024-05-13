package thrusday_28_lab;

public class Payment extends Servicing_Bill	//Payment class is extends Servicing_Bill class
{
	public void Pay()	// this is pay method 
	{
		do 
		{
			System.out.println("Do You want to pay bill know Y/N");
			choice=sc.next().charAt(0);
			System.out.println("Pay Bill Option");
			System.out.println("1:GPay\n2:Phone Pay\n3:UPI\n4:Cash");// Display menus for Customer Payment
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice)	// use switch case
			{
				case 1:
					System.out.println("Payment Successfully.....");
					break;
				case 2:
					System.out.println("Payment Successfully.....");
					break;
				case 3:
					System.out.println("Payment Successfully.....");
					break;
				case 4:
					System.out.println("Payment Successfully.....");
					break;
				default:
					System.out.println("Invalid choice");
			}			
		}while(choice=='y' || choice=='Y');
		System.out.println(("Thank You For Comming...."));
	}
}
