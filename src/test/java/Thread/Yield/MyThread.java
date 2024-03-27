package Thread.Yield;

public class MyThread extends Thread{
    public void run(){
        MyThread my = new MyThread();
        my.setPriority(MAX_PRIORITY);
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
            my.yield();
        }
    }
}
