package Thread.Join;

public class JoinDemoChildThread {
    public static void main(String[] args) throws InterruptedException {
        MyThreadJoinChild.t = Thread.currentThread();
        MyThreadJoinChild myt = new MyThreadJoinChild();
        myt.start();
        myt.join(10000);
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
            Thread.sleep(2000);
        }
    }
}

class MyThreadJoinChild extends Thread{
    static Thread t;
    public void run(){
        try {
            t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }
}