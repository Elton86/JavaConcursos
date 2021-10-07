package Vetores;

public class Vetor {

    public static void main(String[] args) {

        String[] carros = new String[3];
        carros[0] = "Opala";
        carros[1] = "Gol";
        carros[2] = "Palio";

        // Tamanho do vetor
        System.out.println(carros.length);

        // Aterando um item do vetor.
        carros[1] = "Fiesta";

        // Percorrendo os itens de um vetor.

        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);

        }

        // Percorrendo os itens de um vetor com foreach.
        for (String string : carros) {
            System.out.println(string);
        }
    }

}
