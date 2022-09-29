package Arrays;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {

		int[] one = {5, 2, 7, 1, 4, 7, 3};

		Class cname = one.getClass();

		//System.out.println(cname);//class [I
		//System.out.println(cname.getName());//[I

		//copy array
		int[] oneCopy = new int[one.length];
		System.arraycopy(one, 2, oneCopy, 0, 4);

		for (int i = 0; i < oneCopy.length; i++) {
			//	System.out.print(oneCopy[i]+" ");
		}

		String name = "gnana sekar";
		char[] chname = name.toCharArray();
		char[] newName = new char[5];
		System.arraycopy(chname, 6, newName, 0, 5);
		//System.out.println(String.valueOf(newName));//sekar

		//clone
		int[] cloneOne = one.clone();

		/*
		 * we create the clone of a single-dimensional array, 
		 * it creates the deep copy of the Java array. It means, it will copy the actual value. 
		 * But, if we create the clone of a multidimensional array, 
		 * it creates the shallow copy of the Java array which means it copies the references.
		 */

		//	System.out.println(cloneOne.equals(one));
		//	System.out.println(one.hashCode());
		//	System.out.println(one == cloneOne);
		//	System.out.println(cloneOne.hashCode());

		int[][] oned = {{1, 2}, {2, 4}};
		int[][] cloneOned = oned.clone();

		System.out.println(cloneOned.equals(oned));
		System.out.println(oned.hashCode());
		System.out.println(oned == cloneOned);
		System.out.println(cloneOned.hashCode());

		int[] two = Arrays.copyOf(one, one.length);

		Arrays.sort(one);

		//Integer.compare(one, two);

		for (int i = 0; i < one.length; i++) {
			Integer.compare(two[i], one[i]);
			//System.out.println(one[i]);
		}
	}
}
