package Constructer;

import java.util.Scanner;

public class defaukt_cons_demo 
{

	public static void main(String[] args) 
	{
		defaukt_cons_demo obj = new defaukt_cons_demo ();
		obj.Prime();	
	}
	//Calculate Prime Numbers
	public void Prime()//create default constructer
	{
		  int num,i,flag=0;
		  Scanner sc= new Scanner(System.in);
		  System.out.print("Enter Your Number:");
		  num=sc.nextInt();
		  for(i=2;i<num;i++)
		  {
			  if(num%i==0)
			  {
				    flag=1;
				    break;
			  }
		  }
		  if(flag==0)
			  System.out.println(num+" Is Prime Number");
		  else
			  System.out.println(num+" Is Not Prime Number");
		  sc.close();
	 }
}
