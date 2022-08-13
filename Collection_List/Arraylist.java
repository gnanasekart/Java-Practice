package Collection_List;

import java.util.*;
public class Arraylist
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		//----------------adding element------------------
		list.add("gnana");
		list.add("sekar");
		list.add("gowri");
		list.add("shankar");
		list.add("kumar");
		list.add(3, "between");

		//find size of the element
		System.out.println(list.size());

		//ensuring the capacity
		list.ensureCapacity(12);
		System.out.println("size = "+list.size());

		//cloning the list
		Object clist = list.clone();
		System.out.println("Clone - " +clist);

		//get the value
		System.out.println("getValue = "+list.get(4));

		//to check weather array list is empty or not
		System.out.println(list.isEmpty());

		// to check the last index value
		System.out.println("lastIndexof = "+list.lastIndexOf("kumar"));//5
		System.out.println("lastIndexof = "+list.lastIndexOf("list"));//-1

		//convert the list to array by using toArray()
		String[] name = list.toArray(new String[list.size()]); 
		// don't forget to use sq.bracket for array size initialize
		System.out.println("Array "+Arrays.toString(name)); // Arrays handle the array
		Collections.sort(list);
		System.out.println("after sorting :" +list);
		list.trimToSize();
		//list.removeRange(2, 4)

		//for each loop
		//list.forEach(a-> System.out.println("for each method :" +a));

		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			//System.out.println("Iterator = "+itr.next());
		}

		//-------------------------ListIterator----------------------------------------------

		ListIterator<String> ls = list.listIterator();
		while(ls.hasNext())
		{
			System.out.println("This is the value of "+ls.next()+" from the index "+ls.nextIndex());
		}
		System.out.println("forward iterator ends");
		while(ls.hasPrevious())
		{
			System.out.println("This is the value of "+ls.previous()+" from the index "+ls.previousIndex());
		}

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("gnana");
		//list1.add("new subway");

		//retain all will take the common item in both the list
		//list1.retainAll(list);
		//list.retainAll(list1);
		//list1.addAll(list);

		Collections.sort(list);
		System.out.println("sorting = " +list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverse sorting = "+list);

		//remove 0th index element - between is removed from list
		list.remove(0);

		//now list compare with list1 and removed the list element form list1
		//list1.removeAll(list);
		list1.remove(list.contains("gnana"));
		System.out.println(list);

		//removing a word which in the list by using removeIf() method
		list.removeIf(str-> str.contains("gnana"));
		//System.out.println(list);
		//System.out.println("after trimming :" +list);


		//------------------Array to list--------------------------------------
		Integer[] id = {101, 102, 103, 104};
		List<Integer> ids = new ArrayList<>();
		for(Integer no:id)
		{
			ids.add(no);
		}
		
		System.out.println(ids);
		System.out.println(list);
		System.out.println("fetch value- " +list.get(3));
		System.out.println("Set data- " +list.set(3, "inbetween"));
		//System.out.println(list.lastIndexOf(list));
		Collections.sort(list);
		System.out.println(list);
	}
}