package hierarchialinheritance;
public class ChildA extends Parent
{
	int a=5,b=10,sum;
	public void add()
	{
		sum=a+b;
		System.out.println("Sum:"+sum);
		System.out.println("Change");
		System.out.println("New change");
		System.out.println("Changing");
	}
	public void display2()
	{
		System.out.println("Child A");
	}
	public static void main(String[] args)
	{
		ChildA obj=new ChildA();
		obj.add();
		obj.display();
		obj.display2();
	}
}
