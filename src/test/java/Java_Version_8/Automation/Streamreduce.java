package Java_Version_8.Automation;

import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class Streamreduce {
	
	@Test
	public void reduceexp1() {
		System.out.println(IntStream.range(1, 5).reduce((a,b) -> a+b));
	}

}
