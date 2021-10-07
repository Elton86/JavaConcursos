package Recursao;

//Metodo para somar o valor digitado pelo usuario até o 1 em ordem decrescente.

public class Soma {

    static int somatorio(int valor) {
        if (valor > 0) {
            return valor += somatorio(valor - 1);
        } else {
            return 0;
        }

    }

}
