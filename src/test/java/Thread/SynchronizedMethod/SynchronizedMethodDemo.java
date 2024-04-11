package Thread.SynchronizedMethod;

public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "dhoni");
        MyThread t2 = new MyThread(d2, "sachin");
         t1.start();//both the thread execute simultaneously
         t2.start();//output will be irregular flow
    }
}

//to avoid both the thread execute simultaneously we need to mention synchronized

class Display{
    public static synchronized void wish(String name){
        for (int i = 0; i < 3; i++) {
            System.out.println("Good Mrng :");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){ }
            System.out.print(name+"\n");
        }
    }
}

class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d, String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
