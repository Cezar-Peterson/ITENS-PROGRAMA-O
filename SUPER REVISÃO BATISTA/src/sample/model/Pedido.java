package sample.model;

public class Pedido {
    //ATRIBUTOS
    private String data;
    private ItensDoPedido itens;
    private Cliente cliente;

    //CONSTRUTOR
    public Pedido(){
        itens = new ItensDoPedido();
    }

    //GETTERS AND SETTERS
    public void setProduto(String nome, double preco){
        itens.setProduto(nome, preco);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //ToString
    public String toString(){
        return itens + "\nCliente: " + cliente + "\nData da Compra: " + data;
    }
}
