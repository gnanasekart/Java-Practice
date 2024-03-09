package Thread.Yield;

public class YieldDemo {
    public static void main(String[] args) {
        MyThread myt = new MyThread();
        myt.start(); // will call no argument run method
        //myt.interrupt();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
