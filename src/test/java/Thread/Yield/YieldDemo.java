package Thread.Yield;

public class YieldDemo {
    public static void main(String[] args) {
        MyThread myt = new MyThread();
        myt.start();
        //myt.interrupt();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
