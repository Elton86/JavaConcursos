package Heranca_Polimorfismo;

public class Cachorro extends Animal implements Animais {

    // Construtor default de uma subclass precisa da key "super()"
    public Cachorro() {
        super();
    }

    // Construtor referenciando a superclasse
    public Cachorro(int numPatas, String nome, String corPelo) {
        super(numPatas, nome);
        this.corPelo = corPelo;
    }


    public Cachorro(String nome, String corPelo) {
        super(4, nome); // seta o valor padrão de 4 patas.
        this.corPelo = corPelo;
    }

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    void som() {
        System.out.println("au au");
    }

    // Ex de utilizacao da key 'super' com sobrescrita
    String caracteristica() {
        return super.caracteristica() + " eh adestrado";
    }

    @Override
    public void dormir() {
        System.out.println("dorme muito!");

    }

    @Override
    public void correr() {
        System.out.println("Corre razoavelmente");
    }

    @Override
    public String toString() {
        return this.nome + this.numPatas + this.corPelo;
    }
}
