package Arquivos;

import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivos {

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("/home/elton/Workspace/JavaConcursos/Arquivos/pasta/teste.txt");
            // Metodo da classe FileWriter pata escrever no arquivo
            myWriter.write("Elton Teste");
            myWriter.close(); // Necessario fechar.
            System.out.println("Escrito com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um ero.");
            e.printStackTrace();
        }
    }

}
