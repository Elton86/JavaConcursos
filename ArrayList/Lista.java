package ArrayList;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<String>();

        // Adiciona elementos a lista
        carros.add("BMW");
        carros.add("Ford");

        // Pega um item da lista
        carros.get(0);

        // Modificar um item
        carros.set(0, "Opala");

        // Percorre a lista
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        // ou
        /*
         * Os elementos em um ArrayList são, na verdade, objetos. Nos exemplos acima,
         * criamos elementos (objetos) do tipo "String"
         */
        for (String carro : carros) {
            System.out.println(carro);
        }

        // Limpa a lista
        carros.clear();
    }
}
