package Arquivos;

import java.io.File;
import java.io.IOException;

public class CriacaoArquivos {

    public static void main(String[] args) {

        try {
            // cria um objeto da classe e especifiqa o nome do arquivo ou o nome do
            // diretório:
            File file = new File("/home/elton/Workspace/JavaConcursos/Arquivos/pasta/teste.txt");
            // metodo para criação do arquivo
            if (file.createNewFile()) {
                file.mkdir();
                System.out.println("Arquivo criado");
            } else {
                System.out.println("Arquivo já existe");
            }
        } catch (IOException e) {
            System.out.println("Ocorre um erro na geração do arquivo.");
            e.printStackTrace();

        }

    }

}
