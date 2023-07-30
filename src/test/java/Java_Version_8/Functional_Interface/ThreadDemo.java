package Java_Version_8.Functional_Interface;

public class ThreadDemo {
    public static void main(String[] args) {
        //lambda expression
        Runnable r = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("child Thread");
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++)
            System.out.println("main thread");
    }
}
