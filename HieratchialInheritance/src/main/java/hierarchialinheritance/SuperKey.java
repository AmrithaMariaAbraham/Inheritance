package hierarchialinheritance;
public class SuperKey 
{
	int a=5,b=6,sum;
	public SuperKey()
	{
		System.out.println("Super Key constructor");	
	}
	public void add()
	{
		sum=a+b;
		System.out.println("Sum:"+sum);
	}
}
