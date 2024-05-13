package Constructer_chaining;

public class Const_chain 
{
	Const_chain()//this is no argument constructor
	{
		this(2);
		System.out.println("my no agr constructor");
	}

	Const_chain(int num1)
	{
		this(2,4);
		System.out.println("my single parameter constuctor");
	}
	
	Const_chain(int num1,int num2)
	{
		System.out.println("my two parameter constuctor");
	}
	public static void main(String[] args) 
	{
		Const_chain obj=new Const_chain();// this is default constructor
		new Const_chain();
	}

}
