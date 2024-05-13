package thrusday_28_lab;;

abstract public class Service_Center // this is abstract class
{
		private int carNo;
		public String CarName;
		abstract public void Accept_Details();  // this is abstract method
		
		// Encapsulation
		public int getCarNo() // this is getter method
		{
			return carNo;
		}
		
		public void setCarNo(int carNo) // this is setter class
		{
			this.carNo = carNo;
		}
}
