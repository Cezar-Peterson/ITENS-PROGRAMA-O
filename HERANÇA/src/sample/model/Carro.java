package sample.model;

public class Carro extends Veículo{

    //ATRIBUTOS
    private int portas;

    //CONSTRUTOR
    public Carro(String nome){
        super(nome);

    }

    //GETTERS AND SETTERS
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }


    //ToString
    @Override
    public String toString() {
    return super.toString() + "\nPortas: " + portas;
    }
}
