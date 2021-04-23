package sample.model;

public class Endereco {
    //ATRIBUTOS
    private String rua;
    private int numero;

    //GETTERS AND SETTERS
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //ToString
    @Override
    public String toString(){
        return "Endereco: " + rua +
                ", Número: "+ numero;
    }
}
