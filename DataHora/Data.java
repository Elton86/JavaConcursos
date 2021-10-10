package DataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*Java não tem uma classe Date embutida, mas podemos importar o java.
time pacote para trabalhar com a API de data e hora.*/

public class Data {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        LocalDateTime dataEhora = LocalDateTime.now();
        System.out.println(data); // Retorna a data atual
        System.out.println(dataEhora); // Retorna a data e hora atual

        // Define uma formatação
        DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dataFormatada = dataEhora.format(formataData);
        System.out.println("Após formatação: " + dataFormatada);

    }

}
