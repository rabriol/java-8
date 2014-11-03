package br.com.uol.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

/**
 * Created by rafaeuoliveira on 11/2/14.
 */
public class Exemplo_6_Streams {

    public static void main(String[] m) {
        //words
        List<String> words = Arrays.asList("mineiro", "baiano", "paulistano");
        Stream<String> stream = words.stream();

        stream.filter(x -> x.length() <= 6).forEach(System.out::println);

        //even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> evenNumbers = numbers.stream();

        evenNumbers.filter(x -> x % 2 == 0).map(x -> x * 2).forEach(System.out::println);

        //books
        List<Book> books = Arrays.asList(new Book("Java 8", 5), new Book("Java 7", 4), new Book("Java 6 EE", 3));
        Stream<Book> streamBooks = books.stream();

        streamBooks.filter(b -> b.getNumberOfStars() > 3).map(Book::getTitle).forEach(System.out::println);
    }
}

class Book{
    private final String title;
    private final int numberOfStars;

    public Book(String title, int numberOfStars) {
        this.title = title;
        this.numberOfStars = numberOfStars;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }
}
