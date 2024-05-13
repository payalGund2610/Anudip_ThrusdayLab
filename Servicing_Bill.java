package thrusday_28_lab;

public class Servicing_Bill extends Customer_details // Servicing_Bill extends Customer_details
{
	String result;
	int choice;
	double Bill = 0;
	public void Service()
	{
	do
	{
	System.out.println("1: Washing \n2: Cleaning \n3: Repairing ");  // display menu in automobile service
	System.out.println("Enter Your choice:");
	choice = sc.nextInt();
			switch(choice)// use Switch case 
			{
				case 1:
					result+="Washing\t\t\t5000 RS\n";
					System.out.println("Your Car is Ready");
					Bill+=5000;	// calculate bill
					break;
				case 2:
					result+="Cleaning\t\t\t3000 RS\n";
					System.out.println("Your Car is Clean");
					Bill+=3000;
					break;
				case 3:
					int choice1;
					do
					{
					System.out.println("Repairing ");
					System.out.println("1:color modification\t\t4000\n2:oil changing\t\t\t1500\n3: body work\t\t\t11000"); // Display menu in Repairing
					System.out.println("Enter Your Choice:");
					choice1=sc.nextInt();
						switch(choice1) // use switch with in switch
						{
							case 1:
								result+="color Modification\t\t4000 RS\n";
								System.out.println("color Modification is complete");
								Bill+=4000;
								break;
							case 2:
								result+="oil changing\t\t\t1500 RS\n";
								System.out.println("oil is change");
								Bill+=1500;
								break;
							case 3:
								result+="body work\t\t\t11000 RS\n";
								System.out.println("body work is complete");
								Bill+=11000;
								break;
						}							
					System.out.println("Do You Want Any Another Service in Repairing Y/N");
					choice=sc.next().charAt(0);
					}while(choice=='Y' || choice=='y');
					break;
			}
		System.out.println("Do You Want Any Another Service for car Y/N");
		choice=sc.next().charAt(0);
		}while(choice=='Y' || choice=='y');
	}
	public void Total_Bill()	// Display total and final Bill
	{
		System.out.println("------------------------------------------------");
		System.out.println("Details_name\t\t\tDetails");
		System.out.println("------------------------------------------------");
		System.out.println("Customer Name\t\t\t"+Cus_Name);
		System.out.println("Customer_phone_no\t\t"+Cus_Phone_no);
		System.out.println("Car Number\t\t\t"+carNo);
		System.out.println("Car Name\t\t\t"+CarName);
		System.out.println("service\t\t\t\tPrice");
		System.out.println(result);
		System.out.println("------------------------------------------------");
		System.out.println("Total Bill\t\t\t"+Bill);
		System.out.println("------------------------------------------------");
	}
}
