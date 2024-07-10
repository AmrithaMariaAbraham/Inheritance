package exception;
public class ExceptionHandling2 {
int a=6,div;
public void add()
{
	try
	{
	div=a/0;
	System.out.println("div:"+div);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Exception handles successfully");
	}
}
	public static void main(String[] args) {
		
		ExceptionHandling2 obj=new ExceptionHandling2();
		obj.add();
	}

}
