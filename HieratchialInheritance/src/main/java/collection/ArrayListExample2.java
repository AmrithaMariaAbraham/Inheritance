package collection;
import java.util.ArrayList;
public class ArrayListExample2 //Non Generic
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(5);
		obj.add(15);
		obj.add(20);
		int size=obj.size();
		System.out.println("Size:"+size);
		obj.remove(2);
		//obj.removeAll(obj);
		System.out.println(obj);
		boolean b=obj.contains(15);
		System.out.println(b);
		
		ArrayList obj1=new ArrayList();
		obj1.add(10);
		obj1.add(25);
		obj1.add(30);
		obj1.addAll(obj);
		System.out.println(obj1);
		obj1.removeAll(obj1);
		System.out.println(obj1);		
	}
}
