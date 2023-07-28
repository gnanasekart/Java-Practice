package Java_Version_8.Automation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;


public class ArrayListSort_J8 {

	@Test
	public void example1() {

		List<QAList> lst = new ArrayList<>();

		lst.add(new QAList(1001, "sam", "QA Engineer"));
		lst.add(new QAList(1003, "Gopi", "QA Arch"));
		lst.add(new QAList(1006, "naveen", "Jr QA"));
		lst.add(new QAList(1007, "balaji", "Sr QA Engineer"));
		lst.add(new QAList(1010, "koushik", "Principle QA Engineer"));

		List<QAList> employee = lst.stream().filter(qa -> qa.getPost().contains("Engineer"))
				.sorted(Comparator.comparing(QAList::getEmpId))
				.collect(Collectors.toList());

		System.out.println(employee.get(employee.size()-1).getName());
	}
}
