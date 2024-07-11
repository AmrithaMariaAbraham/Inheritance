package abstraction;
public class AbstractB extends AbstractA 
{
	public static void main(String[] args) 
	{
		AbstractB obj=new AbstractB();
		obj.display();
		AbstractA.display1();
		obj.display2();		
	}
	@Override
	public void display2() 
	{
		System.out.println("Abstract method");		
	}
}
