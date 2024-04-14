package Thread.DaemonThread;

public class DaemonThreadDemo {

    public static void main(String[] args) {
        MyThreadDaemon d = new MyThreadDaemon();
        d.setDaemon(true);
        d.start();
        System.out.println("End of main thread");
    }
}

class MyThreadDaemon extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
