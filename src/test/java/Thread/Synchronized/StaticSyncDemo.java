package Thread.Synchronized;

class DisplaySS{
    public synchronized void wish(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){ }
        }
    }

    public synchronized void displayChar(){
        for (int i = 65; i < 75; i++) {
            System.out.print((char) i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){ }
        }
    }
}

class MyThreadSS extends Thread{
    DisplaySS d;
    MyThreadSS(DisplaySS d){
        this.d=d;
    }
    public void run(){
        d.wish();
    }
}

class MyThreadSSc extends Thread{
    DisplaySS d;
    MyThreadSSc(DisplaySS d){
        this.d=d;
    }
    public void run(){
        d.displayChar();
    }
}

public class StaticSyncDemo {
    public static void main(String[] args) {
        DisplaySS d = new DisplaySS();
        MyThreadSS t1 = new MyThreadSS(d);
        MyThreadSSc t2 = new MyThreadSSc(d);
        t1.start();
        t2.start();
    }
}