package sample.model;

public class Ingredientes {
    //ATRIBUTOS
    String nome;
    double qtde;
    String unidadeMedida;

    //GETTERS AND SETTERS
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

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    //ToString
    @Override
    public String toString() {
        return
                "\nnome: " + nome +
                "\nqtde: " + qtde +
                "\nunidadeMedida: " + unidadeMedida
                ;
    }
}
