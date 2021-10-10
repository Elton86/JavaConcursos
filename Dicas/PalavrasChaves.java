package Dicas;

public abstract class PalavrasChaves {

    volatile double Salario; // Indica que Salário é modificável por threads distintas;
    static int idade; // Indica que Idade é compartilhada por todos objetos;
    transient char sexo; // Indica que Sexo não pode ser serializável;
    final String Nome = "Nome Fixo"; // Indica que Nome é um atributo constante;

    // Indica que esse método não possui corpo
    abstract int soma(int a, int b);

    // Indica que esse método não pode ser sobrescrito
    final int subtracao(int a, int b) {
        return a - b;
    }

    // Indica que esse método só pode acessar atributos de classe e não pode ser
    // sobrescrito. Pode ser acessado sem criar um objeto da classe.
    static int procuto(int a, int b) {
        return a * b;
    }

    // Indica que esse método foi escrito outra linguagem
    // Sem corpo
    native int soma_2(int a, int b);

    // Indica que esse método só é executável por uma thread por vez
    synchronized int soma_3(int a, int b) {
        return a + b;
    }

}
