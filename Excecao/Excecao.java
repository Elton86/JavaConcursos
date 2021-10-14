package Excecao;

public class Excecao {

    public static void main(String[] args) {

        /*
         * A instrução try permite definir um bloco de código a ser testado quanto a
         * erros enquanto está sendo executado.
         * 
         * A instrução catch permite definir um bloco de código a ser executado, se
         * ocorrer um erro no bloco try.
         * 
         * A finallyinstrução permite que você execute o código, depois try...catch,
         * independentemente do resultado.
         * 
         */

        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]); // Valor fora do range
        } catch (Exception e) {
            System.out.println("ocorreu um erro.");
        } finally {
            System.out.println("o programa será finalizado.");
        }

        checkAge(15);

    }

    /*
     * A instrução throw permite que você crie um erro personalizado. A instrução
     * throw é usada junto com um tipo de exceção. Existem muitos tipos de exceção
     * disponíveis em Java: ArithmeticException, FileNotFoundException,
     * ArrayIndexOutOfBoundsException, SecurityException, etc:
     */

    private static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Proibido menores de 18");
        } else {
            System.out.println("Pode entrar");
        }
    }

}
