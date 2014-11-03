package br.com.uol.exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rafaeuoliveira on 11/2/14.
 */
public class Exemplo_4_Method_Reference {
    public static void main(String[] m) {
        List<String> cars = Arrays.asList("Corsa", "Opala", "Fusca", "Focus");

        Collections.sort(cars, (s1, s2) -> s1.compareTo(s2));
        System.out.println(cars);

        List<String> cars2 = Arrays.asList("Corsa", "Opala", "Fusca", "Focus");

        Collections.sort(cars2, String::compareTo);
        System.out.println(cars2);

        List<String> cars3 = Arrays.asList("Corsa", "Opala", "Fusca", "Focus");

        Collections.sort(cars3, Comparator::compareStrings);
        System.out.println(cars3);
    }
}

class Comparator {
    public static int compareStrings(String a, String b) {
        return a.compareTo(b);
    }
}
