package encapsulation;
public class ClassA 
{
private int a,b;
	public void setter(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void getter()
	{
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
}
