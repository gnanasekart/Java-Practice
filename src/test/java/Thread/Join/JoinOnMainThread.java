package Thread.Join;

public class JoinOnMainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}

//main thread - Thread.currentThread()
//main thread join method on same thread