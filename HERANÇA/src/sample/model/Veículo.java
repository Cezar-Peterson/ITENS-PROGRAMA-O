package sample.model;

public abstract class Veículo {

    //ATRIBUTOS
    private String nome;
    private String marca;

    //CONSTRUTOR
    public Veículo(String nome){
        this.nome = nome;
    }

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //ToString
    @Override
    public String toString() {
        return "Veículo" +
                "\nnome: " + nome +
                "\nmarca: " + marca ;
    }
}
