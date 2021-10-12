package Listas;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");
        System.out.println(carros);

        carros.get(0); // Acessar um item

        carros.set(0, "Opel"); // Mudar um item

        carros.remove(0); // Remover um item

        carros.size(); // Tamanho da lista

        // Percorre a lista
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }

        for (String i : carros) {
            System.out.println(i);
        }

        carros.clear(); // Limpa a lista

    }

}
