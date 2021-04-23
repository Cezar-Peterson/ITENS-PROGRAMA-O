package sample.model;

public class Caminhão extends Veículo {
    //ATRIBUTOS
    private int eixos;

    //CONSTRUTOR
    public Caminhão(String nome){
        super(nome);

    }

    //GETTERS AND SETTERS
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() +
                "\nEixos: " + eixos;
    }
}
