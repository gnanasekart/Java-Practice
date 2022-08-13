package Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.testng.annotations.Test;

public class CollectionsSynchronized {

	@Test
	public void synchronised_Collection() throws InterruptedException {

		Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
		Runnable listOperations = () -> {
			syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5));
		};

		Thread thread1 = new Thread(listOperations);
		Thread thread2 = new Thread(listOperations);

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		if(syncCollection.size() == 10) {
			System.out.println("correct");
		}else {
			System.err.println("wrong");
		}
	}

	@Test
	public void synchronised_List() {
		List<String> syncCollection = Collections.synchronizedList(Arrays.asList("a", "b", "c"));
		List<String> uppercasedCollection = new ArrayList<>();

		Runnable listOperations = () -> {
			synchronized (syncCollection) {
				syncCollection.forEach((e) -> {
					uppercasedCollection.add(e.toUpperCase());
				});
			}
		};
	}

	@Test
	public void CopyOnWrite() {
		CopyOnWriteArrayList<String> copyOnWrite = new CopyOnWriteArrayList<String>(Arrays.asList("gnana", "sekar", "mohan"));

		Iterator it = copyOnWrite.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
