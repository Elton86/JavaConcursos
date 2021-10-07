package Heranca_Polimorfismo;

public class Galinha extends Animal {

    // Construtor default de uma subclass precisa da key "super()"
    public Galinha() {
        super();
    }

    // Construtor referenciando a superclasse
    public Galinha(int numPatas, String nome, String corPena) {
        super(numPatas, nome);
        this.corPena = corPena;
    }

    // "this." acessa os itens da propria classe
    // "super." acessa os itens da super classe
    private String corPena;

    public String getCorPena() {
        return corPena;

    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    void som() {
        System.out.println("có có");
    }

    //Ex de utilizacao da key 'super' com sobrescrita
    String caracteristica() {
        return super.caracteristica() + " bota ovo";
    }

}
