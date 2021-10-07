package Vetores;

public class Vetor2 {

    int[] numeros;
    int cont = 0;

    // Retorna um valor cujos elementos são multiplicados por 2.
    public int[] lista(int[] num) {
        numeros = new int[num.length];
        for (int i = 0; i < num.length; i++) {

            numeros[i] = num[i] * 2;

        }

        return numeros;

    }

}
