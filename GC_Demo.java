package Garbej_colector;

public class GC_Demo
{
	public void finalize()// it is use for restore the deleted data or remain data
	{
		System.out.println("byee");
	}
	public static void main(String[] args) 
	{

		GC_Demo gc= new GC_Demo();
		gc=null;
		System.gc();// it is garbed collector
	}

}
