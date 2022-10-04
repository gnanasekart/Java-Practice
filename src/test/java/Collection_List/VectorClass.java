package Collection_List;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector vec = new Vector();
		
		vec.add("good");
		vec.add("bad");
		vec.add("nice");
		vec.add("hi");
		
		String[] txt = new String[vec.size()];
		vec.copyInto(txt);
		
		for (int i = 0; i < txt.length; i++) {
			//System.out.println(txt[i]);
		}
		
		System.out.println(vec.subList(1, 3));//[bad, nice]

	}

}
