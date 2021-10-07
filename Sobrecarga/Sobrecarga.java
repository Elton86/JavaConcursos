package Sobrecarga;

// Exemplo de sobrecarga. Ocorre em tempo de compilação.
// Vários métodos podem ter o mesmo nome, desde que o número e / ou tipo de parâmetros sejam diferentes.
public class Sobrecarga {

    static boolean soma() {

        return false; // se for vazia, retorna falso.

    }

    static int soma(int x) {

        return x;

    }

    static float soma(float x, float y) {

        return x + y;

    }

    public static void main(String[] args) {
        System.out.println(soma());
        System.out.println(soma(3));
        System.out.println(soma(2, 4));
    }

}
