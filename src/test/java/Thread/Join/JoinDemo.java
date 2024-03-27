package Thread.Join;

import Thread.Yield.MyThread;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThreadJoin myt = new MyThreadJoin();
        myt.start();
        myt.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
