package br.com.uol.exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rafaeuoliveira on 11/2/14.
 */
public class Exemplo_4_Method_Reference {
    public static void main(String[] m) {
        Exemplo_4_Method_Reference.lambda_example();

        Exemplo_4_Method_Reference.static_example();

        Exemplo_4_Method_Reference.instance_example();

        Exemplo_4_Method_Reference.instance_of_arbritary_object();
    }

    public static void lambda_example() {
        List<String> cars = Arrays.asList("Corsa", "Opala", "Fusca", "Focus");

        Collections.sort(cars, (s1, s2) -> s1.compareTo(s2));
        System.out.println(cars);
    }

    public static void static_example() {
        List<String> cars3 = Arrays.asList("Corsa", "Opala", "Fusca", "Focus");

        Collections.sort(cars3, Comparator::_compareStrings);
        System.out.println(cars3);
    }

    public static void instance_example() {
        List<String> cars4 = Arrays.asList("Corsa", "Opala", "Fusca", "Focus");
        Comparator comparator = new Comparator();

        Collections.sort(cars4, comparator::compareStrings);
        System.out.println(cars4);
    }

    public static void instance_of_arbritary_object() {
        List<String> cars2 = Arrays.asList("Corsa", "Opala", "Fusca", "Focus");

        Collections.sort(cars2, String::compareTo);
        System.out.println(cars2);
    }
}

class Comparator {
    public static int _compareStrings(String a, String b) {
        return a.compareTo(b);
    }

    public int compareStrings(String a, String b) {
        return a.compareTo(b);
    }
}
