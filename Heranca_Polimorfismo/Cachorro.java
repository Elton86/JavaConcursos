package Heranca_Polimorfismo;

public class Cachorro extends Animal {

    //Construtor default de uma subclass precisa da key "super()"
    public Cachorro(){
        super();
    }
    
    // Construtor referenciando a superclasse
    public Cachorro(int numPatas, String nome, String corPelo) {
        super(numPatas, nome);
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

    //Ex de utilizacao da key 'super' com sobrescrita
    String caracteristica() {
        return super.caracteristica() + " eh adestrado";
    }

}
