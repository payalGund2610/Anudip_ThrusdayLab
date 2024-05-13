package Thr_Class_Lab;

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
    {
    	double a,b;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("_*_*_*_*_* CALCULATOR*_*_*_*_*_*");
    	System.out.println("__________________________________");
    	System.out.println("enter the numbers:");// accept number which you want
    	a=sc.nextDouble();
    	b=sc.nextDouble();
    	System.out.println("enter operator(+,-,*,/)");
    	char operator=sc.next().charAt(0);
    	double c=0;
    		switch(operator)// switch case for accepting operator
    		{
    		case '+':
    			c=a+b;
    			break;
    		case '-':
    			c=a-b;
    			break;
    		case '*':
    			c=a*b;
    			break;	    			
    		case '/':
    			c=a/b;
    			break;
    		default:
    			System.out.println("Enter valid input");
    		}
    			System.out.println("final Answer:");
    			System.out.print(a + " " + operator + " " + b+ " = " + c);// perform final operation
    		sc.close();
    	}
}
