package Java_Version_8.java8Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class convert_4_ListToMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "song");
		map.put(2, "music");
		map.put(3, "waves");

		Map<Integer, String> name = map.entrySet().stream()
				.filter(m -> m.getKey() == 3)
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

		System.out.println(name);

		//Map -> stream -> filter -> string
		String name1 = map.entrySet().stream()
				.filter(m -> m.getKey() == 3)
				.map(m -> m.getValue())
				.collect(Collectors.joining());

		System.out.println(name1);
	}
}