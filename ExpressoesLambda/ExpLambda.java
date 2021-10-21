package ExpressoesLambda;

import java.util.ArrayList;

/*
     * Uma expressão lambda é um pequeno bloco de código que recebe parâmetros e
     * retorna um valor. As expressões lambda são semelhantes aos métodos, mas não
     * precisam de um nome e podem ser implementadas diretamente no corpo de um
     * método. As expressões são limitadas. Eles devem retornar um valor imediatamente
     *  e não podem conter variáveis, atribuições ou instruções como if ou for. 
     */

public class ExpLambda {

    public static void main(String[] args) {

        // () -> 42 // Não recebe nada e sempre retorna "42"
        // x -> x*x // Recebe algo e retorna seu quadrado
        // (x,y) -> x + y // Recebe dois valores e retorna sua soma

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(9);
        numeros.add(1);
        
        numeros.forEach((n) -> {
            System.out.println(n);
        });

    }

}
