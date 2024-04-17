package Thread.MultiThreadEnhancement;

public class ThreadGroupConst {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("First group");
        System.out.println(g1.getParent().getName());//main

        ThreadGroup g2 = new ThreadGroup(g1, "second group");
        System.out.println(g2.getParent().getName());//First group
    }
}
