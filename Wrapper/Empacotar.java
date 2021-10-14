package Wrapper;

import java.util.ArrayList;

/* Os Wrapper são conhecidos na linguagem Java como classes especiais que 
possuem métodos capazes de fazer conversões em variáveis primitivas e 
também de encapsular tipos primitivos para serem trabalhados como objetos, 
ou seja, é feita um embrulho de streams que são fluxo de dados através de canais. 
existe uma classe Wrapper para cada tipo primitivo identificado pelo mesmo nome 
do tipo que possui e tendo a primeira letra maiúscula. */

public class Empacotar {

    public static void main(String[] args) {

        // ArrayList<int> myNumbers = new ArrayList<int>(); // Invalido

        ArrayList<Integer> myNumbers = new ArrayList<Integer>(23);

        myNumbers.add(23);
        myNumbers.add(21);

        for (Integer iterable : myNumbers) {
            System.out.println(iterable);
        }

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // métodos para obter informações sobre o objeto
        System.out.println(myDouble.doubleValue());

        // converter objetos wrapper em strings.
        System.out.println(myInt.toString());

    }

}
