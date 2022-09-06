package Java8Concept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class SortCars {

	@Test
	public void example1() {

		List<Zoomcars> list = new ArrayList<Zoomcars>();
		list.add(new Zoomcars("i10", "petrol", 12000));
		list.add(new Zoomcars("i20", "petrol", 2000));
		list.add(new Zoomcars("benz", "des", 122000));
		list.add(new Zoomcars("bmw", "des", 100000));

		//with out duplicate entry
		Map<Long, List<Zoomcars>> map = list.stream().collect(Collectors.groupingBy(Zoomcars::getPrice));
		//System.out.println(map);

		//with duplicate entry
		list.add(new Zoomcars("astro", "des", 122000));
		
		List<Zoomcars> lst = list.stream().sorted(Comparator.comparing(Zoomcars::getPrice))
				.collect(Collectors.toList());

		//need only car in petrol type
		List<Zoomcars> lst1 = list.stream().filter(st -> st.getName().equalsIgnoreCase("petrol"))
		.sorted(Comparator.comparing(Zoomcars::getPrice))
		.collect(Collectors.toList());
		
		//sort car by name and price
		List<Zoomcars> lst2 = list.stream()
				.sorted(Comparator.comparing(Zoomcars::getName))//least priority will be first
				.sorted(Comparator.comparing(Zoomcars::getPrice))//price is first prority
				.collect(Collectors.toList());

		System.out.println(lst2);
	}



}
