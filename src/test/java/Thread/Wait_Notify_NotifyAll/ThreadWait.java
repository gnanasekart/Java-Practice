package Thread.Wait_Notify_NotifyAll;

/*
without synchronized for wait and notify
public class ThreadWait {
    public static void main(String[] args) throws InterruptedException {
      Threadloop t = new Threadloop();
      t.start();
      t.wait();
      System.out.println(t.total);
    }
}

class Threadloop extends Thread {
    int total=0;
    public void run() {
        for (int i = 0; i <= 100; i++) {
            total+=i;
        }
        this.notify();
    }
}

output - Exception in thread "main" java.lang.IllegalMonitorStateException: current thread is not owner
 */

public class ThreadWait {

    public static void main(String[] args) throws InterruptedException {
        Threadloop t = new Threadloop();
        t.start();
        synchronized (t) {
            t.wait();
        }
        System.out.println(t.total);
    }
}

class Threadloop extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 100; i++) {
                total += i;
            }
            this.notify();
        }
    }
}
