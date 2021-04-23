package sample.model;

public class Produto {

    //ATRIBUTOS
    public String Nome;
    public double Preco;
    public int Quantidade;

    //FUNÇÕES
    public double ValorTotalEmEstoque(){
        return Preco*Quantidade;
    }
    public void AdicionarProdutos(int quantidade){
        this.Quantidade += quantidade;
    }
    public void RemoverProdutos(int quantidade){
        this.Quantidade -= quantidade;
    }

    //Seria o ToString
    public String imprimir() {
        return Nome +", R$"
                + Preco + ", "
                + Quantidade
                +" Unidades, Total: R$ "
                + ValorTotalEmEstoque();
    }
}
