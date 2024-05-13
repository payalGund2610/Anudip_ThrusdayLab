// Bank Apllication where accept some basic details and do the process of deposit, with and display check balance.
package encapsulation;

public class My_BankDetails 
{
	private int pin_no,adhar_no,phone_no;
	private String pan_no;
	String user_name;
	private int ac_balance=2000;
	
	public int getPhone_no() 
	{
		return phone_no;
	}
	public void setPhone_no(int phone_no)
	{
		this.phone_no = phone_no;
	}
	public int getPin_no() 
	{
		return pin_no;
	}
	public void setPin_no(int pin_no) 
	{
		this.pin_no = pin_no;
	}
	public int getAdhar_no() 
	{
		return adhar_no;
	}
	public void setAdhar_no(int adhar_no) 
	{
		this.adhar_no = adhar_no;
	}
	public String getPan_no() 
	{
		return pan_no;
	}
	public void setPan_no(String pan_no) 
	{
		this.pan_no = pan_no;
	}
	public int getAc_balance() 
	{
		return ac_balance;
	}
	public void setAc_balance(int ac_balance) 
	{
		this.ac_balance = ac_balance;
	}
	
	
}
