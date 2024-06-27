package hierarchialinheritance;
public class SuperKey1 extends SuperKey
{
	public SuperKey1()
	{
		super();
		System.out.println("Constructor2");
		System.out.println(super.a);
		super.add();
	}
	public static void main(String[] args)
	{
		SuperKey1 sk1=new SuperKey1();
		sk1.add();
	}
}
