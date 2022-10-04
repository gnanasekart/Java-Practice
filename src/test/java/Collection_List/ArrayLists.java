package Collection_List;
import java.util.*;
public class ArrayLists
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("gnana");
		list.add("sekar");
		list.add("gowri");
		list.add("shankar");
		list.add("kumar");
		list.add(3, "between");

		//list to Array using toArray()
		String[] name = list.toArray(new String[list.size()]);
		String names = Arrays.toString(name);
		System.out.println(names);

		if(list.contains("gnana"))
		{
			System.out.println("yes correct");
		}

		
		List<String> syncList = Collections.synchronizedList(list);
		
		synchronized (syncList) {
			
		}
		
	}
}