package encapsulation;

import java.util.Scanner;

public class Bank_Operation 
{
	Scanner sc= new Scanner(System.in);
	My_BankDetails obj = new My_BankDetails();
	public void Accept_details()
	{
		int ph_no,adh_no;
		String pan_no;
		System.out.println("Enter Your Name:");
		obj.user_name=sc.next();
		
		System.out.println("enter your phone_no:");
		ph_no=sc.nextInt();
		obj.setPhone_no(ph_no);
		
		System.out.println("enter your adhar_no:");
		adh_no=sc.nextInt();
		obj.setAdhar_no(adh_no);
		//obj.setadhar_no(sc.nextInt());
		
		System.out.println("enter your pan_no:");
		pan_no=sc.next();
		obj.setPan_no(pan_no);
	}
	
	public void display_data()
	{
		System.out.println("name:"+obj.user_name);
		System.out.println("phone number:"+obj.getPan_no());
		System.out.println("adhar number:"+obj.getAdhar_no());
		System.out.println("phone number"+obj.getPhone_no());
	}
	public void transaction()
	{
		System.out.println("1.deposite\n2:withdraw\n3:balance");
		int choice=sc.nextInt();
		int amount;
		char ans;
		do
		{
		switch(choice)
		{
		case 1:
			System.out.println("enter your amount for DEP:");
			amount=sc.nextInt();
			
			int ac_balance=obj.getAc_balance();
			ac_balance+=amount;
			obj.setAc_balance(ac_balance);
			break;
			
		case 2:
			System.out.println("enter your amount for Withdraw:");
			amount=sc.nextInt();
			
			int ac_balanc=obj.getAc_balance();
			ac_balanc=amount;
			obj.setAc_balance(ac_balanc);
			break;
		case 3:
			System.out.println("the account bance is:"+obj.getAc_balance());
			break;
		default:
			System.out.println("enter valid choice only");
		}
		System.out.println("do you want to re enter the choice Y/N");
		ans=sc.next().charAt(0);
		}
		while(ans=='y' || ans=='Y');
		System.out.println("Thank You");
	}
}



















