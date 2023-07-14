package Collection.Collection_List;

import java.awt.List;

public class ListInterface {

	public static void main(String[] args) {
		List list = new List();
		
		//adding element
		list.add("gnana");
		list.add("sekar");
		list.add("gowri");
		list.add("shankar");
		list.add("kumar");
		
		list.add("t", 2);
		
		for (int i = 0; i < list.getItemCount(); i++) {
			//System.out.println(list.getItem(i));
		}
		
		list.replaceItem("tgs", 2);
		
		for (int i = 0; i < list.getItemCount(); i++) {
			System.out.println(list.getItem(i));
		}
		
	}

}
