package exception;
public class ExceptionHandling 
{
	int a=5,div;
	public void add()
	{
		try
		{
		div=a/0;
		System.out.println("Division:"+div);
		}
		catch(Exception e)
		{
			System.out.println("Division by zero not possible:" +e);
		}
	}
	public static void main(String[] args) 
	{
		ExceptionHandling obj=new ExceptionHandling();
		obj.add();
	}
}
//1 try and multiple catch block program-->arrayindexoutofbound
