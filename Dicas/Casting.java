package Dicas;

public class Casting {

    public static void main(String[] args) {

        // byte -> short -> char -> int -> long ** float -> double - Implicito/Ampliação
        // - Automaticamente
        // double-> float ** long-> int-> char-> short->byte - Explicito/Redução -
        // Manualmente

        System.out.println("Conversão Implícita:");

        double a1 = 10 * 5.2 + 4 - 1.3; // Trata-se de um float que será covertido para double
        System.out.println("Variável a1 = " + a1);
        double a2 = 9 / 3;
        System.out.println("Variável a2 = " + a2);

        System.out.println("\nConversão Explícita:"); // Casting manual! o que se faz na prática.
        int a4 = (int) (10 * 5.2 + 4 - 1.3);
        System.out.println("Variável a4 = " + a4);
        int a5 = (int) (5 / 2.0);
        System.out.println("Variável a5 = " + a5);

    }

}
