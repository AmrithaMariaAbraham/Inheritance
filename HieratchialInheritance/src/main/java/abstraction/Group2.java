package abstraction;
public class Group2 implements Group1
{
	public static void main(String[] args) 
	{
		Group2 obj=new Group2();
		obj.add();
		obj.mul();	
		//interfacename objectname=new classname();-->Accessing methods from Interface by creating Interface object
		Group1 obj1=new Group2();
		obj1.add();
		obj1.mul();
	}
	public void add()
	{
		System.out.println("Interface extends and implemented in Group2");		
	}
	public void mul() 
	{
		System.out.println("Group2 implements extended Interface");		
	}
}
