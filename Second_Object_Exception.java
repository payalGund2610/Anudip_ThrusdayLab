package Thr_Lab_4;

class NextObject 
{
    private static NextObject instance;

    private NextObject() 
    {
        // Private constructor to prevent instantiation outside of this class
    }

    public static NextObject getInstance() throws Second_Object_Exception 
    {
        if (instance == null) 
        {
            instance = new NextObject();
            return instance;
        } 
        else 
        {
            throw new Second_Object_Exception("Only one object can be created.");
        }
    }
}

public class Second_Object_Exception extends Exception 
{
    public Second_Object_Exception(String message) 
    {
        super(message);
    }
    public static void main(String[] args) 
    {
        try 
        {
        	NextObject obj1 = NextObject.getInstance();
            System.out.println("Object 1 created successfully.");

            // Uncommenting the next line will result in an exception
            NextObject obj2 = NextObject.getInstance();
        } 
        catch (Second_Object_Exception e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
