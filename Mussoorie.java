//Creating one superclass Hill stations and three subclasses Manali, Mussoorie, Gulmarg.
//Subclasses extend the superclass and override its location() and famousfor() method.
//We will call the location() and famousfor() method by the Parent class’, i.e. Hillstations class.
//As it refers to the base class object and the base class method overrides the superclass method;
//the base class method is invoked at runtime.
package Thr_Lab_25;

public class Mussoorie extends Hill_Station
{
	@Override
	public void Location()
	{
		System.out.println("Mussoorie is located in the state of Uttarakhand, India.");
	}
	@Override
	public void Famousfor()
	{
		System.out.println("Mussoorie is famous for its pleasant weather and colonial architecture.");
	}
}
