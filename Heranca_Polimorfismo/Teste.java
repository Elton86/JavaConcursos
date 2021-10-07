package Heranca_Polimorfismo;

public class Teste {

    public static void main(String[] args) {
        // Ex de heranca
        Galinha galinha = new Galinha();
        galinha.nome = "zefinha";
        galinha.numPatas = 2;
        galinha.setCorPena("vermelha");
        System.out.println(galinha.nome + " " + galinha.numPatas + " " + galinha.getCorPena());

        // ex heranca chamando o construtor
        Cachorro cachorro = new Cachorro(4, "totó", "branco");
        System.out.println(cachorro.nome + " " + cachorro.numPatas + " " + cachorro.getCorPelo());

        // Exe de polimorfismo / sobrescrita
        Animal galinha2 = new Galinha();
        galinha2.som();
        System.out.println(galinha2.caracteristica());

        Animal cachorro2 = new Cachorro();
        cachorro2.som();
        System.out.println(cachorro2.caracteristica());

    }

}
