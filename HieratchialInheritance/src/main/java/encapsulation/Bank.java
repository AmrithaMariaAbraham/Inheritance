package encapsulation;
public class Bank 
{
	private int pinnum;
	public void setter(int pinnum)
	{
		this.pinnum=pinnum;
	}
	public void validate()
	{
		if(pinnum==1001||pinnum==1234||pinnum==1212)
			System.out.println("Pin number matching:"+pinnum);
		else
			System.out.println("Pin number not matching:"+pinnum);
	}
	public void getter()
	{
		System.out.println("Pin number:"+pinnum);
	}
}
