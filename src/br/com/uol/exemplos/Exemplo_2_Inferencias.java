package br.com.uol.exemplos;

/**
 * Created by rafaeuoliveira on 11/2/14.
 */
public class Exemplo_2_Inferencias {
    public static void main(String[] m) {
        new Test().execute(2, 3, (a, b) -> { System.out.println("Antes de avaliar a expressão");
                                            return a > b;});

        new Test().execute(2, 3, (a, b) -> a > b);
    }
}

class Test {
    public void execute(int a, int b, Testable testable) {
        System.out.println(testable.test(a, b));
    }
}

@FunctionalInterface
interface Testable {
    public boolean test(int a, int b);
}
