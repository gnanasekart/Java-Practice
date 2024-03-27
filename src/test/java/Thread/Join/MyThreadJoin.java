package Thread.Join;

public class MyThreadJoin extends Thread{
    public void run(){
        MyThreadJoin my = new MyThreadJoin();
        my.setPriority(MAX_PRIORITY);
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
            my.yield();
            Thread.interrupted();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
