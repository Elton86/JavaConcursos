package Iteradores;

import java.io.File;

public class ExcluirArquivos {

    public static void main(String[] args) {
        File file = new File("/home/elton/Workspace/JavaConcursos/Arquivos/pasta/teste.txt");
        if (file.delete()) {
            System.out.println("Arquivo deletado: " + file.getName());
        } else {
            System.out.println("Ocorreu um erro na exclusao.");
        }
    }
}
