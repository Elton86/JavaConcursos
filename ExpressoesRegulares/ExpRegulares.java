package ExpressoesRegulares;

import java.util.regex.*;

public class ExpRegulares {

    /*
     * Uma expressão regular é uma sequência de caracteres que forma um padrão de
     * pesquisa. Ao pesquisar dados em um texto, você pode usar esse padrão de
     * pesquisa para descrever o que está procurando.
     */

    public static void main(String[] args) {

        /*
         * O padrão é criado usando o método Pattern.compile(). O primeiro parâmetro
         * indica qual padrão está sendo pesquisado e o segundo parâmetro tem um
         * sinalizador para indicar que a pesquisa deve ser insensível a maiúsculas e
         * minúsculas. O segundo parâmetro é opcional.
         */
        Pattern padraoTexto = Pattern.compile("texto", Pattern.CASE_INSENSITIVE);
        /*
         * O método matcher() é usado para pesquisar o padrão em uma string. Ele retorna
         * um objeto Matcher que contém informações sobre a pesquisa realizada.
         */
        Matcher validaTexto = padraoTexto.matcher("texto de teste");
        /*
         * O método find() retorna verdadeiro se o padrão foi encontrado na string e
         * falso se não foi encontrado.
         */
        boolean verificaTexto = validaTexto.find();
        if (verificaTexto) {
            System.out.println("Padrao encontrado");
        } else {
            System.out.println("Padrao nao encontrado");
        }

        //Outro exemplo
        Pattern padraoNumero = Pattern.compile("[0-9]");
        Matcher validaNumero = padraoNumero.matcher("Tem algum numero 7 aqui?");
        boolean verificaNumero = validaNumero.find();
        System.out.println(verificaNumero ? "sim" : "nao");

    }

}
