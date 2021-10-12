package Listas;

import java.util.LinkedList;

/* Como funciona a ArrayList
A ArrayListclasse possui um array regular dentro dela. Quando um elemento é adicionado, ele é colocado na matriz. 
Se o array não for grande o suficiente, um novo array maior é criado para substituir o antigo e o antigo é removido.

Como funciona a LinkedList
O LinkedListarmazena seus itens em "contêineres".
 A lista possui um link para o primeiro container e cada container possui um link para o próximo container na lista. 
 Para adicionar um elemento à lista, o elemento é colocado em um novo contêiner e esse contêiner é vinculado a um dos 
 outros contêineres da lista. */

public class ListaEncadeada {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
