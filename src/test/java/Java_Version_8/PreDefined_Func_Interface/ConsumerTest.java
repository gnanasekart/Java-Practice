package Java_Version_8.PreDefined_Func_Interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        ArrayList<Movie> l = new ArrayList<>();
        populateMovie(l);

        Consumer<Movie> c = m ->{
            System.out.println(m.name+"-"+m.hero+"-"+m.villan);
        };

        for(Movie m: l) {
            c.accept(m);
        }
    }

    private static void populateMovie(ArrayList<Movie> l) {
        l.add(new Movie("bha", "pra", "rana"));
        l.add(new Movie("bha2", "pra2", "rana2"));
        l.add(new Movie("bha3", "pra3", "rana3"));
    }
}

class Movie{
    String name;
    String hero;
    String villan;

    public Movie(String name, String hero, String villan) {
        this.name = name;
        this.hero = hero;
        this.villan = villan;
    }
}
