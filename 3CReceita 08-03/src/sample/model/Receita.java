package sample.model;

import java.util.ArrayList;
import java.util.List;

public class Receita {
    //ATRIBUTOS
    private String nome;
    private String descricao;
    private List<Ingredientes> ingredientes;

    //CONSTRUTOR
    public Receita(){
        ingredientes = new ArrayList<>();
    }

    //GETTERS AND SETTERS
    public List<Ingredientes> getIngredientes(){
        return ingredientes;
    }

    public void setIngrediente(String nome, double qtde, String um){
        Ingredientes ingredientes2 = new Ingredientes();
        ingredientes2.setNome(nome);
        ingredientes2.setQtde(qtde);
        ingredientes2.setUm(um);
        ingredientes.add(ingredientes2);
    }


    public void setIngredientes(Ingredientes ingredientes){
        this.ingredientes = (List<Ingredientes>) ingredientes;
    }




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

    //ToString
    @Override
    public String toString() {
        return "Receita" +
                "\nnome: " + nome +
                "\ndescricao: " + descricao+
                "\nIngredientes" + ingredientes
                ;
    }
}
