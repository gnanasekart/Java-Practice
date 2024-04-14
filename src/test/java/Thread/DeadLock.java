package Thread;


public class DeadLock extends Thread {
    A a = new A();
    B b = new B();

    public void m1(){
        this.start();
        a.d1(b);//execute by main thread
    }

    public void run(){
        b.d2(a);//execute by child thread
    }

    public static void main(String[] args) {
        DeadLock t = new DeadLock();
        t.m1();//call normal m1 method
    }
}

class A{
    public synchronized void d1(B b){
        System.out.println("d1 method");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){ }
        System.out.println("b last method");
        b.last();
    }

    public synchronized void last(){
        System.out.println("inside A last method");
    }
}


class B{
    public synchronized void d2(A a){
        System.out.println("d2 method");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){ }
        System.out.println("a last method");
        a.last();
    }

    public synchronized void last(){
        System.out.println("inside B last method");
    }
}
