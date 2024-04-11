package Thread.SynchronizedBlock;

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        DisplaySB d1 = new DisplaySB();
        DisplaySB d2 = new DisplaySB();
        MyThreadSB t1 = new MyThreadSB(d1, "dhoni");
        MyThreadSB t2 = new MyThreadSB(d2, "sachin");
         t1.start();//both the thread execute simultaneously
         t2.start();//output will be irregular flow
    }
}
//In the below case only some part of code required to be maintained in synchronized block instead of entire method
class DisplaySB{
    public void wishSB(String name){
        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;//lakhs of lines of code

        synchronized(DisplaySB.class) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Good Mrng :");
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){ }
                System.out.print(name+"\n");
            }
        }

        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;//lakhs of lines of code
    }
}

class MyThreadSB extends Thread{
    DisplaySB d;
    String name;
    MyThreadSB(DisplaySB d, String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wishSB(name);
    }
}


