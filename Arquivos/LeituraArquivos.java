package Arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivos {

    public static void main(String[] args) {

        File file = new File("/home/elton/Workspace/JavaConcursos/Arquivos/pasta/teste.txt");
        try {

            Scanner leitor = new Scanner(file);
            while (leitor.hasNextLine()) {
                String dado = leitor.nextLine();
                System.out.println(dado);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro!");
            e.printStackTrace();
        }

        if (file.exists()) {
            System.out.println("Nome do arquivo: " + file.getName());
            System.out.println("Caminho: " + file.getAbsolutePath());
            System.out.println("Pode escrever: " + file.canWrite());
            System.out.println("Pode ler " + file.canRead());
            System.out.println("Tamanho do arquivo em bytes " + file.length());
        } else {
            System.out.println("Arquivo não existe!");
        }

    }

}
