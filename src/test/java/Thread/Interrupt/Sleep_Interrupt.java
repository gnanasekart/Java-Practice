package Thread.Interrupt;

public class Sleep_Interrupt {
    public static void main(String[] args) {
        //MyThread t = new MyThread();
        MyThreadCatch t = new MyThreadCatch();
        t.start();
        t.interrupt();
    }
}

class MyThread extends Thread{
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("sleep thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

class MyThreadCatch extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("sleep thread ="+i);
        }
        try{Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
