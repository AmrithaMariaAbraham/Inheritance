package hierarchialinheritance;

public class ChildB extends Parent {

	public void display1()
	{
		System.out.println("Child B");
		System.out.println("Change");
	}
	public static void main(String[] args) {
		ChildB obj2=new ChildB();
		obj2.display();
		obj2.display1();

	}

}
