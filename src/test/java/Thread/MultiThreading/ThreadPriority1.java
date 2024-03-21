package Thread.MultiThreading;

public class ThreadPriority1 {

    public static void main(String[] args) {

        MyThreadP1 t = new MyThreadP1();
        t.setPriority(10);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}

class MyThreadP1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }
}
