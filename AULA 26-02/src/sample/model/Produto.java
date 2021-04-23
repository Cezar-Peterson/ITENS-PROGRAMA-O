package sample.model;

//classe produto
public class Produto {
    //atributos
    String nome;
    double preco;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){ return this.preco;}
    public void setPreco(double preco){this.preco = preco;}


    public String toString(){
        return "Nome do produto: "+nome+"\nPreço: R$"+preco+"\n\n";
    }
}
