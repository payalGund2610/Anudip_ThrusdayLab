package Thr_Lab_4;
import java.io.IOException;

public class Chained_Exception
{
	public void chainedException() throws Throwable  // throw exception
	{
		try // use try block
        {
            throw new ArithmeticException("Arithmatic Exception.")// throw Arithmatic Exception
              .initCause(new IOException("IO Exception."));
        }
        catch(ArithmeticException ae) // use catch block
        {
            System.out.println("Occure exception : " + ae);
            System.out.println("Original exception: "+ ae.getCause());
        }
	}
    public static void main(String[] args) throws Throwable // main function
    {
    	Chained_Exception obj=new Chained_Exception();
    	obj.chainedException();
    }    
}
