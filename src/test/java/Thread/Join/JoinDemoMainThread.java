package Thread.Join;

import Thread.Yield.MyThread;

public class JoinDemoMainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThreadJoin myt = new MyThreadJoin();
        myt.start();
        //myt.join();
        myt.join(10000);//wait for 10 sec and execute main thread between child thread
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}

class MyThreadJoin extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("child thread");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
