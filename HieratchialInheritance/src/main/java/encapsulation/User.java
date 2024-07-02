package encapsulation;
public class User 
{
	public static void main(String[] args)
	{
		Bank obj=new Bank();
		obj.setter(1234);
		obj.validate();
		obj.getter();
		obj.setter(1111);
		obj.validate();
		obj.getter();
	}
}
