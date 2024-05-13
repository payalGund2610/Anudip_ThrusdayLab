//Creating one superclass Hill stations and three subclasses Manali, Mussoorie, Gulmarg.
//Subclasses extend the superclass and override its location() and famousfor() method.
//We will call the location() and famousfor() method by the Parent class’, i.e. Hillstations class.
//As it refers to the base class object and the base class method overrides the superclass method;
//the base class method is invoked at runtime.
package Thr_Lab_25;

public class Manali extends Hill_Station  // this is first subclass of Hill Station
{
	@Override
	public void Location()
	{
		System.out.println("Manali is located in the state of Himachal Pradesh, India.");
	}
	@Override
	public void Famousfor()
	{
		System.out.println("Manali is famous for its scenic beauty and adventure sports");
	}
}
