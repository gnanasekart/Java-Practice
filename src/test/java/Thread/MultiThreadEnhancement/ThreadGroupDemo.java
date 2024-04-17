package Thread.MultiThreadEnhancement;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());


        ThreadGroup g1 = new ThreadGroup("First group");

        Thread g2 = new Thread(g1, "Second group");
        Thread g3 = new Thread(g1, "third group");
        g1.setMaxPriority(3);
        Thread g4 = new Thread(g1, "fourth group");
        System.out.println(g2.getPriority());//5
        System.out.println(g3.getPriority());//5
        System.out.println(g4.getPriority());//3
    }
}
