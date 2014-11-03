package br.com.uol.exemplos;

/**
 * Created by rafaeuoliveira on 11/2/14.
 */
public class Exemplo_1_Classe_Anonima_VS_Lambda {

    public static void main(String[] m) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Classe Anônima");
            }
        }).start();

        new Thread(() -> System.out.println("Lambda")).start();
    }
}
