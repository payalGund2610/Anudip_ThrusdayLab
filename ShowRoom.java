package Thr_Class_Lab;
import java.util.Scanner;
public class ShowRoom 
{
	 String Name;
	 long mobile_no;
	 double Cost,Discount;
	 Scanner input=new Scanner(System.in);
	 ShowRoom() // this is default constructor
	 {
		  Name=" ";
		  mobile_no=1234567890;
		  Cost=123.321;
		  Discount=123;
	 }
	 public void input() // Accept the input
	 {
		  System.out.print("Enter customer name=");
		  Name=input.next();
		  System.out.print("Enter customer mobile number=");
		  mobile_no=input.nextLong();
		  System.out.print("Enter item cost=");
		  Cost=input.nextDouble();
	 }
	 public void calculate() // calculate the discount
	 {
		  if(Cost<=10000)
		  {
			   System.out.println("*-*-*-*-*-*-*-Congratulation *-*-*-*-*-*-");
			   System.out.println("You have 5% discount");
			   Discount=Cost*0.05;
		  }
		  else if(Cost>10000 && Cost<=20000)
		  {
			   System.out.println("*-*-*-*-*-*-*-Congratulation *-*-*-*-*-*-");
			   System.out.println("You have 10% discount");
			   Discount=Cost*0.10;
		  }
		  else if(Cost>20000 && Cost<=35000)
		  {
			   System.out.println("*-*-*-*-*-*-*-Congratulation *-*-*-*-*-*-");
			   System.out.println("You have 15% discount");
			   Discount=Cost*0.15;
		  }
		  else
		  {
			   System.out.println("*-*-*-*-*-*-*-Congratulation *-*-*-*-*-*-");
			   System.out.println("You have 20% discount");
			   Discount=Cost*0.20;
		  }
	 }
	 public void display()// Display total bill
	 {
		  System.out.println("==== YOUR TOATAL BILL====");
		  System.out.println("Name="+Name);
		  System.out.println("Mobile no="+mobile_no);
		  System.out.println("Cost="+Cost);
		  System.out.println("Discount price="+Discount);
		  System.out.println("Paid price="+(Cost-Discount));
	 }
	 public static void main(String[] args) 
	 {
		  ShowRoom obj=new ShowRoom();// object creation
		  obj.input();
		  obj.calculate();      // method calling
		  obj.display();
	 }

}
