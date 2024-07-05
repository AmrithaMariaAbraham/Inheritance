package abstraction;
public class InterfaceImpliment implements Group,Group1//multiple inheritance
{

	public static void main(String[] args) 
	{
		InterfaceImpliment obj=new InterfaceImpliment();
		obj.add();
		obj.mul();
	}
	public void add() 
	{
		int sum=a+b+c;
		System.out.println("Sum is:"+sum);		
	}
	public void mul() 
	{
		int mul=a*b;
		System.out.println("Product is:"+mul);		
	}
}
