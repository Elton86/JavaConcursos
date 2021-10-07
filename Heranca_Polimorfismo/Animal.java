package Heranca_Polimorfismo;

public abstract class Animal {

    

    public Animal(int numPatas, String nome) {
        this.numPatas = numPatas;
        this.nome = nome;
    }

    public Animal() {
    }

    protected int numPatas;
    protected String nome;

    // classes abstratas não possuem corpo
    abstract void som();

    String caracteristica(){
        return "Esse animal: ";
    } 
       
}
