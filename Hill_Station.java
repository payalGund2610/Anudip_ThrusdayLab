//Creating one superclass Hill stations and three subclasses Manali, Mussoorie, Gulmarg.
//Subclasses extend the superclass and override its location() and famousfor() method.
//We will call the location() and famousfor() method by the Parent class’, i.e. Hillstations class.
//As it refers to the base class object and the base class method overrides the superclass method;
//the base class method is invoked at runtime.

package Thr_Lab_25;

// this is main class 
public abstract class Hill_Station 
{
	public abstract void Location();
	public abstract void Famousfor() ;

}
