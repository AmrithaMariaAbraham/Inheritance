package collection;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample 
{
	public static void main(String[] args)
	{
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("Amritha");
		obj.add("Lakshmi");
		obj.add("Vyshnavi");
		obj.add("Akhil");
		obj.add("Vishnu");
		obj.add("Abhiram");
		int size=obj.size();
		System.out.println("Size:"+size);
		System.out.println(obj);	
		Iterator<String> obj1=obj.iterator();
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
			//System.out.println(obj1.remove());
		}
	}
}
