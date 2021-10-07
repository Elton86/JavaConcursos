package Controle;

public class Selecao {

    public void escolha(int idade) {

        if (idade <= 1)
            System.out.println("Bebe");
        else if (idade > 1 && idade <= 10)
            System.out.println("Criança");
        else if (idade > 10 && idade <= 13)
            System.out.println("Pré-adolescente");
        else if (idade > 13 && idade <= 18)
            System.out.println("Adolescente");
        else
            System.out.println("Adulto");

        // Operação ternária

        boolean resultado = idade >= 18 ? true : false;
        if (resultado) {
            System.out.println("pode tirar carteira");
        } else {
            System.out.println("NAO pode tirar carteira");
        }

    }
}
