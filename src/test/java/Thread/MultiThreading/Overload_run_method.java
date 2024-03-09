package Thread.MultiThreading;


public class Overload_run_method {
    public static void main(String[] args) {
       MyThread t = new MyThread();
       t.start();
    }
}


class MyThread extends Thread{
    public void run(){
        System.out.println("no arg run");
    }
    public void run(int i){
        System.out.println("int arg run");
    }
}
