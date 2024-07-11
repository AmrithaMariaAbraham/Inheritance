package collection;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample 
{
	public static void main(String[] args)
	{
		LinkedList<String> obj=new LinkedList<String>();
		LinkedList<Float> obj2=new LinkedList<Float>();
		obj.add("Amritha");
		obj.add("Lakshmi");
		obj.add("Vyshnavi");
		obj.add("Akhil");
		obj.add("Vishnu");
		obj.add("Abhiram");
		obj2.add(11.5f);
		obj2.add(20.6f);
		int size=obj.size();
		System.out.println("Size:"+size);
		System.out.println(obj);
		int size1=obj2.size();
		System.out.println("Size:"+size1);
		System.out.println(obj2);
		Iterator<String> obj1=obj.iterator();
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
			System.out.println("Removed values:");
			System.out.println(obj.remove());
			System.out.println(obj.remove());
			System.out.println(obj.remove());
			System.out.println(obj.remove());
			System.out.println(obj.remove());
			System.out.println(obj.remove());
		}
		Iterator obj3=obj2.iterator();
		while(obj3.hasNext())
		{
			System.out.println(obj3.next());
			System.out.println("Removed Elements");
			System.out.println(obj2.remove(1));	
			System.out.println(obj2.remove(0));	
		}
	}
}
