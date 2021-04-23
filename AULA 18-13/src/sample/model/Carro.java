package sample.model;

public class Carro extends Veiculo{
    //ATRIBUTOS
    private int portas;

    //CONSTRUTORES
    public Carro(String nome){
        super(nome);
    }
    public Carro(String nome, int cavalos){
        super(nome,cavalos);
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
        return super.toString() + "\nPortas: "+portas;
    }
}
