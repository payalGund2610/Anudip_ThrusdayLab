package Thr_Class_Lab;

class Parent   // Superclass
{
	 String Name="Payal";
	 int Age=21;
	 void speak()
	 {
		  System.out.println("Name="+Name);
		  System.out.println("Age="+Age);
	 }
}

class Student extends Parent // subclass of Parent class
{
	 char Grade='A';
	 void study()
	 {
		  super.speak();  // calling superclass methods
		  System.out.println("Grade="+Grade);
	 }
}
public class ParentClass {

 public static void main(String[] args) 
 {
	  Student obj=new Student();
	  obj.study();
 }

}
