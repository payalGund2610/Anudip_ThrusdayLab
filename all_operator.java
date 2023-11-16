//Write a program to accept choice from the user and display the output
//	1.Arithmetic operator
//	2.Logical Operator
//	3.Relational Operator
//	4.Bitwise Operator
//	5.Conditional Operator
//	6.Assignment Operator
package Basic;
import java.util.Scanner;
public class all_operator 
{
	public static void main(String[] args) 
	{
		int num1,num2,ch;
		Scanner sc=new Scanner (System.in);
		System.out.println("-----MENU-----");
		System.out.println("1)Arithmetic operator\n"  //choices
				+ "2)Logical Operator\n"
				+ "3)Relational Operator\n"
			    + "4)Bitwise Operator\n"
				+ "5)Conditional Operator\n"
				+ "6)Assignment Operator\n");
		System.out.println("Enter your choices:");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			//accepting two numbers from user
			System.out.println("Enter the value of num1:");
			num1=sc.nextInt();
			System.out.println("Enter the value of num2:");
			num2=sc.nextInt();
			System.out.println("-----Arithmetic operator------");
			//perform operation by using arithmatic operator (+,-,*,/,%)
			System.out.println("addition of num1 and num2:"+(num1+num2));//for addition
			System.out.println("substraction of num1 and num2:"+(num1-num2));//for substraction
			System.out.println("multiplaction of num1 and num2:"+(num1*num2));//for multiplaction
			System.out.println("division of num1 and num2:"+(num1/num2));//for division
			System.out.println("modulous of num1 and num2:"+(num1%num2));//for modulous
			break;
		case 2:
			boolean result;  //declare the variable boolean for return true/false values
			System.out.println("Enter the value of num1:");
			num1=sc.nextInt();
			System.out.println("Enter the value of num2:");
			num2=sc.nextInt();
			
			System.out.println("--------Logical Operator--------");
			//perform operation by using logical operator (&&,||,!)
			result=(num1>num2)&&(num2<num1);// && operator
			System.out.println("result is "+ result);
			result=(num1>num2)||(num2<num1);// || operator
			System.out.println("result is "+ result);
			result=(num1!=num2);// ! operator
			System.out.println("result is "+ result);
			break;
		case 3:
			// accepted value from user 
			System.out.println("Enter the value of num1:");
			num1=sc.nextInt();
			System.out.println("Enter the value of num2:");
			num2=sc.nextInt();
			System.out.println("-------Relational Operator---------");
			//perform operation by using relational operator (>,<,>=,<=,==,!=)
			result=(num1>num2);
			System.out.println("num1 is greater than num2");
			result=(num1<num2);
			System.out.println("num1 is less than num2");
			result=(num1>=num2);
			System.out.println("num1 is greater than or equals to num2");
			result=(num1<=num2);
			System.out.println("num1 is less than or equals to num2");
			result=(num1==num2);
			System.out.println("num1 is equals to num2");
			result=(num1!=num2);
			System.out.println("num1 is not equals to num2");
			break;
		case 4:
			int result2;
			System.out.println("Enter First number:");
			num1=sc.nextInt();
			System.out.println("Enter Second number:");
			num2=sc.nextInt();
			System.out.println("--------Bitwise Operator--------");
			//the operator of bitwise & 
			result2=num1&num2;
			System.out.println("The Result of & operator is="+result2);
			//the operator of bitwise | 
			result2=num1|num2;
			System.out.println("The Result of | operator is="+result2);
			//the operator of bitwise ^ 
			result2=num1^num2;
			System.out.println("The Result of ^ operator is="+result2);
			break;
		case 5:
			int result1;
			System.out.println("Enter the value of num1:");
			num1=sc.nextInt();
			System.out.println("Enter the value of num2:");
			System.out.println("--------Conditional Operator--------");
			//perform operation by using conditional operator(?:)
			num2=sc.nextInt();
			result1=(num1>num2)?num1:num2; //:?operator use
			System.out.println("The Greatest number is "+result1);
			break;
		case 6:
			System.out.println("Enter the value of num1:");
			num1=sc.nextInt();
			System.out.println("----------Assignment Operator------------");
			//perform operation by using Assignment operator (+=,-=,*=,/=)
			System.out.println(num1+=10);
			System.out.println(num1-=10);
			System.out.println(num1*=10);
			System.out.println(num1/=10);
			break;
		}
		
	}

}
