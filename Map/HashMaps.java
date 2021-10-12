package Map;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<String, String> capitalCidades = new HashMap<String, String>();
        // Add chave/valor ao mapa. Suporte apenas para Int/String.
        capitalCidades.put("AL", "Maceio");
        capitalCidades.put("SE", "Sergipe");
        capitalCidades.put("BA", "Bahia");
        capitalCidades.put("BA", "Bahia"); // Ate permite iguais, mas ignora.

        capitalCidades.remove("SE"); // Remove o par

        // Imprime chaves
        for (String k : capitalCidades.keySet()) {
            System.out.println(k);

        }

        // Imprime valor
        for (String v : capitalCidades.values()) {
            System.out.println(v);
        }

        // Imprime chave e valor
        for (String st : capitalCidades.keySet()) {
            System.out.println("Chave: " + st + " - Valor: " + capitalCidades.get(st));

        }

        capitalCidades.put("PE", "Pernambuco"); // Add par de chave/valor

        System.out.println(capitalCidades.get("AL")); // Capitura o valor

        capitalCidades.size(); // Tamanho do mapa

        capitalCidades.clear(); // Limpa o mapa

    }

}
