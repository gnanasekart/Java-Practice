package java8Stream;

import java.util.Arrays;
import java.util.List;

public class convert_1_ClsToStr {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				new Person("sekar", "sekar@mail.com", Gender.MALE, 21),
				new Person("gnana", "gnana@mail.com", Gender.MALE, 23),
				new Person("priya", "priya@mail.com", Gender.FEMALE, 20),
				new Person("laxmi", "laxmi@mail.com", Gender.FEMALE, 21));

		String name = person.stream()
				.filter(x -> "sekar".equals(x.getName()))//predicates
				.map(Person::getName)//converting person to string
				.findAny()//it will return found
				.orElse(null);//else null return
		
		System.out.println(name);

	}

}
