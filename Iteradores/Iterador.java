package Iteradores;

import java.util.ArrayList;
import java.util.Iterator;

/* Um Iteratoré um objeto que pode ser usado para percorrer coleções, 
como ArrayList e HashSet  */
public class Iterador {

    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");

        // Cria o iterador
        Iterator<String> it = carros.iterator();

        // Imprime os itens um a um
        System.out.println(it.next());
        System.out.println(it.next());

        // Percorrendo uma coleção.
        /*
         * Uma vez iterado, ele continua nos seguintes. Ex: abaixo continua do 3º item
         */

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Removendo itens de uma coleção
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while (it2.hasNext()) {
            Integer i = it2.next();
            if (i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);

        /*
         * Tentar remover itens usando um loop for ou um loop for-each não funcionaria
         * corretamente porque a coleção está mudando de tamanho ao mesmo tempo que o
         * código está tentando executar um loop.
         */
    }
}
