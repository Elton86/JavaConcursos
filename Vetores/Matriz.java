package Vetores;

public class Matriz {

    public static void main(String[] args) {

        // Declando uma matriz
        int[][] numeros = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        // Alterando um elemento da matriz.
        int x = numeros[1][2];
        System.out.println(x);

        // Percorrendo os elementos da matriz.
        for (int i = 0; i < numeros.length; ++i) {
            for (int j = 0; j < numeros[i].length; ++j) {
                System.out.println(numeros[i][j]);

            }
        }

    }

}
