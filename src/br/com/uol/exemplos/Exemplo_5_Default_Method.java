package br.com.uol.exemplos;

import java.util.List;

/**
 * Created by rafaeuoliveira on 11/2/14.
 */
public class Exemplo_5_Default_Method{
    public static void main(String[] a) {
        B b = new B();

        String text = b.getString();

        b.print(text);
    }
}

interface A {
    public String getString();

    default void print(String value) {
        System.out.println("Impresso pelo Default Method. Valor=" + value);
    }
}

class B implements A {

    @Override
    public String getString() {
        return "TEXTO";
    }
}
