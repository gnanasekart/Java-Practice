package Java_Version_8.java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class convert_4_MapToMap {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				new Person("sekar", "sekar@mail.com", Gender.MALE, 21),
				new Person("gnana", "gnana@mail.com", Gender.MALE, 23),
				new Person("priya", "priya@mail.com", Gender.FEMALE, 20),
				new Person("laxmi", "laxmi@mail.com", Gender.FEMALE, 21));

		Map<String, Integer> name = person.stream()
				.collect(Collectors.toMap(p -> p.getName(), p -> p.getAge()));
		
		System.out.println(name);

	}

}
