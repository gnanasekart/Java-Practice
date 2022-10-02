package java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.testng.annotations.Test;

public class StreamReducer {
	
	@Test
	public void personReducer() {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("sekar", "sekar@mail.com", Gender.MALE, 21));
		personList.add(new Person("gnana", "gnana@mail.com", Gender.MALE, 23));
		personList.add(new Person("priya", "priya@mail.com", Gender.FEMALE, 20));
		personList.add(new Person("laxmi", "laxmi@mail.com", Gender.FEMALE, 21));
		
		
		Optional<String> opt = personList.stream().map(p -> p.getName())
		.reduce((name1, name2) -> name1+", "+name2);
		
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		
	}
	
	
	

}
