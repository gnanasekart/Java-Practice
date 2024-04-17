package Thread.MultiThreadEnhancement;

class MyThread extends Thread {
    MyThread(ThreadGroup grp, String name) {
        super(grp, name);
    }

    public void run() {
        System.out.println("child thread");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadGroupDemo1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup parentGrp = new ThreadGroup("ParentGroup");
        ThreadGroup childGrp = new ThreadGroup(parentGrp, "ChildGroup");
        MyThread t1 = new MyThread(parentGrp, "ChildThread1");
        MyThread t2 = new MyThread(parentGrp, "ChildThread2");
        t1.start();
        t2.start();
        System.out.println(parentGrp.activeCount());
        System.out.println(parentGrp.activeGroupCount());
        parentGrp.list();

        Thread.sleep(10000);

        System.out.println(parentGrp.activeCount());
        System.out.println(parentGrp.activeGroupCount());
        parentGrp.list();

    }
}
