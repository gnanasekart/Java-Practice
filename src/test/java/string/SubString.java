package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubString {

	public static void main(String[] args) {
		String s = "welcometojava";
		int k=3;
		System.out.print(getSmallestAndLargest(s, k));
	}
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> list = new ArrayList<>();
        String n="";
        int left=0, right=k;
        while(left<s.length() && right<s.length()){
            n=s.substring(left++, right++);
            list.add(n);
        }
        Collections.sort(list);
        smallest=list.get(0);
        largest=list.get(list.size()-1);
    
        return smallest + "\n" + largest;
    }
}
