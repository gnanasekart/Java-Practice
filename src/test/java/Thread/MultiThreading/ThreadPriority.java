package Thread.MultiThreading;

public class ThreadPriority {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(15); -> RE
        Thread.currentThread().setPriority(7);
        MyThreadP t = new MyThreadP();
        System.out.println(t.getPriority());//7
    }
}

class MyThreadP extends Thread {

}
