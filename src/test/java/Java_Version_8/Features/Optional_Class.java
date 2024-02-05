package Java_Version_8.Features;

import Java_Version_8.java8Stream.Article;

import java.util.Optional;

public class Optional_Class {

    public static void main(String[] args) {
        //Optional<Article> p = Optional.empty();

        Article ar = new Article();
        Optional<Article> p = Optional.of(ar);

        Optional<Article> p1 = Optional.ofNullable(ar);

        System.out.println(p1);
    }
}
