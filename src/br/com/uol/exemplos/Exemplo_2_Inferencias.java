package br.com.uol.exemplos;

/**
 * Created by rafaeuoliveira on 11/2/14.
 */
public class Exemplo_2_Inferencias {
    public static void main(String[] m) {
        new Test((a, b) -> a > b).execute(2, 3);
    }
}

class Test {
    private Testable testable;

    public Test(Testable testable) {
        this.testable = testable;
    }
    public void execute(int a, int b) {
        System.out.println(testable.test(a, b));
    }
}

@FunctionalInterface
interface Testable {
    public boolean test(int a, int b);
}
