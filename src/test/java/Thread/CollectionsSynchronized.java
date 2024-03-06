package Thread;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import org.testng.annotations.Test;

public class CollectionsSynchronized extends Thread{
	static int n, sum=0;

	public static void main(String[] args)  {
		System.out.println("sum of first n numbers");
		System.out.println("Enter a value");
		Scanner scanner = new Scanner(System.in);
		CollectionsSynchronized.n=scanner.nextInt();
		CollectionsSynchronized obj = new CollectionsSynchronized();
		obj.start();
        try {
            obj.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
		System.out.println("sum of first "+CollectionsSynchronized.n+"number is "+CollectionsSynchronized.sum);
    }

	public void run(){
		for (int i = 0; i < n; i++) {
			CollectionsSynchronized.sum += i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
	}

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
