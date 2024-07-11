package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExample 
{
	//List is inbuild interface
	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<Integer>();
		obj.add(15);
		obj.add(20);
		obj.add(25);
		System.out.println(obj);
		for(int i:obj)
		{
			System.out.println(i);
		}
		Iterator obj1=obj.iterator();
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
		}
		
		//Set is an interface. 
		//difference between looping and Iterator
		//Artitecture draw in notebook
		//hasNext();
		//next();
		//remove();
	}

}
