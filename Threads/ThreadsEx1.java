package Threads;

public class ThreadsEx1 extends Thread {

    /*
     * Threads permite que um programa opere com mais eficiência, fazendo várias
     * coisas ao mesmo tempo. Threads podem ser usados ​​para realizar tarefas
     * complicadas em segundo plano, sem interromper o programa principal.
     * 
     * A principal diferença é que quando uma classe estende a classe Thread, 
     * você não pode estender nenhuma outra classe, mas ao implementar a interface 
     * Runnable, é possível estender de outra classe também.
     *
     * Se a classe estende a Threadclasse, o thread pode ser executado criando uma
     * instância da classe e chamando seu método start():
     */
    public static void main(String[] args) {

        ThreadsEx1 threads1 = new ThreadsEx1();
        threads1.start();
        System.out.println("Rodando fora de uma thread");

    }

    public void run() {
        System.out.println("Rodando dentro de uma thread");
    }
}
