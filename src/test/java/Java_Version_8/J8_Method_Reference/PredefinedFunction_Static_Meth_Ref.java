package Java_Version_8.J8_Method_Reference;

import java.util.function.BiFunction;

class Arthimatic{
	public static int add(int a, int b) {
		return a+b;
	}
}

public class PredefinedFunction_Static_Meth_Ref {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adding = Arthimatic::add;
		int result = adding.apply(10, 20);
		System.out.println(result);
	}
}
