package Recursao;

public class Fatorial {

    public int calcularFatorial(int fat) {
        if (fat == 0 || fat == 1) {
            return 1;

        } else {
            return fat *= calcularFatorial(fat - 1);
        }
    }
}

