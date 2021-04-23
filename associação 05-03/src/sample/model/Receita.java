package sample.model;

public class Receita {
    //ATRIBUTOS
    private String nome;
    private String descricao;
    private Ingredientes ingredientes;

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setIngredientes(String nome, double qtde, String unidadeMedida){
        Ingredientes ingredientes = new Ingredientes();
        ingredientes.setNome(nome);
        ingredientes.setQtde(qtde);
        ingredientes.setUnidadeMedida(unidadeMedida);
        this.setIngredientes(ingredientes);

    }

    //ToString
    @Override
    public String toString() {
        return "\nReceita" +
                "\nnome: " + nome +
                "\ndescricao: " + descricao +
                "\n\nIngredientes " + ingredientes
                ;
    }
}
