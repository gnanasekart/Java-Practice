package Thread.DaemonThread;

import Thread.Yield.MyThread;

public class DaemonThread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());//false
        //Thread.currentThread().setDaemon(true);//RE: IllegalThreadStateException

        MyThread t = new MyThread();
        System.out.println(t.isDaemon());//false

        t.setDaemon(true);//can set because still it does not set.
        System.out.println(t.isDaemon());//true
    }
}
