package java8Stream;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamPersonReducer {
	
	public static List<Person> getPerson(){
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("sekar", "sekar@mail.com", Gender.MALE, 21));
		personList.add(new Person("gnana", "gnana@mail.com", Gender.MALE, 23));
		personList.add(new Person("priya", "priya@mail.com", Gender.FEMALE, 20));
		personList.add(new Person("laxmi", "laxmi@mail.com", Gender.FEMALE, 21));
		return personList;
		
	}

	@Test
	public void personReducerAccumulator() {
		

		//Optional<T> reduce(BinaryOperator<T> accumulator)
		Optional<String> opt = getPerson().stream().map(p -> p.getName())
				.peek(p -> System.out.println(p))//this will print the peeked value
				.reduce((name1, name2) -> name1+", "+name2);

		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
	}

	@Test
	public void intReducer() {
		//reduce(T identity, BinaryOperator<T> accumulator)
		System.out.println(Stream.of(2, 3, 4).reduce(2, (x,y) -> (x+y)));
	}
	
	@Test
	public void highestAge() {
		System.out.println(getPerson().stream().reduce((a,b) ->a.getAge() > b.getAge()? a : b));
		
		System.out.println(getPerson().stream()
				.map(Person:: getName)
				.reduce("", (a,b) -> a.concat(b)));
	}
}
