package abstraction;
public abstract class AbstractA 
{
	public AbstractA()
	{
		System.out.println("Abstract Constructor");
	}
	public void display()
	{
		System.out.println("Abstract Static method");
	}
	public static void display1()
	{
		System.out.println("Abstract Class Static method");
	}
	public abstract void display2();//only declaration of abstract method in abstract class,data hiding is achieved in this method only 
}
