package Thr_Class_Lab;
import java.util.*;
class PrimeNumber// parent class of all class
{
	Scanner sc=new Scanner(System.in);
	int num,i,j,flag,temp,lastDigit,remainder=0,count=0;//declare and initialize variables
	double sum=0;
	public void Prime()//Calculate Prime Numbers
	{
		  System.out.println("-------Prime Class-------");
		  System.out.print("Enter Your Number:");
		  num=sc.nextInt();
		  flag=0;
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
	 }
}

class PalindromeNumber extends PrimeNumber //PalindromeNumber class inherit PrimeNumber class
{
	 public void Palindrome()// Calculate Prime numbers
	 {
		  super.Prime();
		  System.out.println("---------Palindrome Class---------");
		  System.out.println("Enter Your Number:");
		  num=sc.nextInt();
		  temp=num;
		  while(temp>0)
		  {
			   lastDigit=temp%10;
			   remainder=lastDigit+(remainder*10);
			   temp/=10;
		  }
		  if(remainder==num)
			  System.out.println(num+" Is Palindrome Number");
		  else
			  System.out.println(num+" Is Not Palindrome Number");
	 }
}
class ArmstrongNumber extends PalindromeNumber // ArmstrongNumber class inherit PalindromeNumber class
{
	 public void Armstrong()// calculate Armstrong numbers
	 {
		  super.Palindrome();
		  System.out.println("--------Armstrong Class ----------");
		  System.out.print("Enter Your Number:");
		  num=sc.nextInt();
		  temp=num;
		  while(temp>0)
		  {
			   count++;
			   temp/=10;
		  }
		  temp=num;
		  while(temp>0)
		  {
			   lastDigit=temp%10;
			   sum=sum+Math.pow(lastDigit,count);
			   temp/=10;
		  }
		  if(sum==num)
			  System.out.println(num+" Is Armstrong Number");
		  else
			  System.out.println(num+" Is Not Armstrong Number");
	 }
}
class PatternPrint extends ArmstrongNumber //PatternPrint class inherit the ArmstrongNumber class
{
	 public void Pattern()//display Patter
	 {
		  super.Armstrong();
		  System.out.println("------------Pattern Class -----------");
		  for(i=1;i<=4;i++)
		  {
			   for(j=1;j<=4-i;j++)
			   {
				   System.out.print(" ");
			   }
			   for(j=1;j<=i;j++)
			   {
				   System.out.print(j);
			   }
			   for(j=i-1;j>=1;j--)
			   {
				   System.out.print(j);
			   }
			   System.out.println();
		  }
	 }
}
public class MultiLevel_Inheritance 
{
	 public static void main(String[] args) 
	 {
		  PatternPrint obj=new PatternPrint();//create object of a child class PatternPrint
		  obj.Pattern();// call PatternPrint class method through object
	 }
}