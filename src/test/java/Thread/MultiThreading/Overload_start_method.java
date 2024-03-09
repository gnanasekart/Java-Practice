package Thread.MultiThreading;


public class Overload_start_method {
    public static void main(String[] args) {
        MyThreadStart t = new MyThreadStart(); // main thread
        t.start();                             // main thread
        System.out.println("main method");
    }
}

class MyThreadStart extends Thread{
    public void start(){                    // main thread
        super.start();                      // create child thread
        System.out.println("start method"); // main thread
    }
    public void run(){                      // child thread take care of run() from start()
        System.out.println("run method");
    }
}

class MyThreadStart1 extends Thread{
    public void start(){                    // main thread
        System.out.println("start method");
    }
    public void run(){                      // main thread
        System.out.println("run method");
    }
}

/*
output-
start method
main method

this outputs are produced by only main thread

by calling super.start we are calling another child thread

main thread execute - start method and main method
child thread execute - run method



 */


