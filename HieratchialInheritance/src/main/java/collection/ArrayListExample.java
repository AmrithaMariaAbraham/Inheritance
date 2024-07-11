package collection;
import java.util.ArrayList;
public class ArrayListExample
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(5);
		obj.add(21);
		obj.add(15);
		obj.add(25);
		obj.add(26);
		System.out.println(obj);
		int a=obj.size();//Finding ArrayList size
		System.out.println("Size:"+a);
		System.out.println(obj.get(5));//getting a value from specified index
		obj.remove(4);//removing an element from an index
		System.out.println(obj);
		boolean b=obj.contains(11);//checks a value is available or not
		System.out.println(b);
		
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		obj1.add(12);
		obj1.add(16);
		obj1.add(22);
		obj1.addAll(obj);//appending multiple ArrayList in a specified collection
		System.out.println(obj1);
		obj1.removeAll(obj1);
		System.out.println(obj1);//removing all value
		//LinkedList,Non Generic ArrayList
	}
}
