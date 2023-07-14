package Collection.Collection_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostCount {

	public static void main(String[] args) {
		String txt = "welcome to testLeaf";
		char[] t = txt.toLowerCase().toCharArray();
		int i=0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		while(i<t.length) map.put(t[i], map.getOrDefault(t[i++], 0)+1);

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		char k=' ';
		int v=0;
		int secondv=0;
		char secondc=k;
		for(Entry<Character, Integer> es : entrySet){
			if(es.getValue() > v){
				v = es.getValue();
				k = es.getKey();
			}
		}
		for(Entry<Character, Integer> sec : entrySet){
			int vs = v-1;
			if(sec.getValue().equals(vs)){
				secondv = sec.getValue();
				secondc = sec.getKey();
			}
		}
		System.out.println("first large count is : "+k+" = "+v);
		System.out.println("Second large count is : "+secondv+" = "+secondc);
	}
}