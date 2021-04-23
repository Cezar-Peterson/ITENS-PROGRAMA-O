package sample.model;

import java.util.ArrayList;
import java.util.List;

public class ItensDoPedido {
    //ATRIBUTOS
    private List<Produto> produtos;
    private double total;

    //CONSTRUTORES
    public ItensDoPedido(){
        produtos = new ArrayList<>();
    }

    //GETTERS AND SETTERS
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProduto(String nome, double preco){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        this.produtos.add(produto);
        total+=preco;
    }

    public void setProdutos(Produto produto) {
        this.produtos.add(produto);
        total += produto.getPreco();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    //ToString
    public String toString(){
        return produtos + "\nTotal: " + total;
    }

}
