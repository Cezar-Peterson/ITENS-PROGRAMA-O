package sample.model;

public class Ingredientes {
    //atributos
    private String nome;
    private double qtde;
    private String um;

    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    //ToString
    @Override
    public String toString() {
        return "Ingredientes" +
                "\nnome: " + nome +
                "\nqtde: " + qtde +
                "\num: " + um
                ;
    }
}
