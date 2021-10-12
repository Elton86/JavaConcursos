package Enumeracao;

public class Enumeracao {
    /*Um enum não pode ser usado para criar objetos e 
    não pode estender outras classes (mas pode implementar interfaces).
    Podem ser inicializados por meio de construtuores.
    Use enums quando você tiver valores que sabe que não vão mudar*/
    enum Zona {
        NORTE, SUL, LESTE, OESTE
    }


    public static void main(String[] args) {

        System.out.println(Zona.OESTE);

    }

}
