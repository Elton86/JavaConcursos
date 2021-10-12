package Set;

import java.util.HashSet;

// Um HashSet é uma coleção de itens em que cada item é único
public class HashSets {

    public static void main(String[] args) {

        HashSet<String> carros = new HashSet<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("BMW"); // Aparece dua vezes, mas só uma vez no conjunto, de fato.
        carros.add("Mazda");
        System.out.println(carros);

        // verificar se existe um item
        carros.contains("Mazda");

        // Para remover um item
        carros.remove("Volvo");

        // Tamanho do conjunto
        carros.size();

        // percorrendo um conjunto
        for (String i : carros) {
            System.out.println(i);
        }

        // Limpar um conjunto
        carros.clear();

    }

}
