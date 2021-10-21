package Threads;

public class ThreadsEx2 implements Runnable {

    /*
     * Se a classe implementa a Runnableinterface, o thread pode ser executado
     * passando uma instância da classe para Threado construtor de um objeto e
     * chamando o start()método do thread
     */
    public static void main(String[] args) {

        ThreadsEx2 threads2 = new ThreadsEx2();
        Thread thread = new Thread(threads2);

        thread.start();
        System.out.println("Executando fora de uma thread ");

    }

    @Override
    public void run() {
        System.out.println("Executando dentro de uma thread ");

    }

}
