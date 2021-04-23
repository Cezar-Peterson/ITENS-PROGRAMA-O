package sample.model;

public class Pedido {
    //ATRIBUTOS
    private String desc;
    private String data;
    private double total;
    private ItensDoPedido itens;

    //CONSTRUTOR
    public Pedido(){
        itens = new ItensDoPedido();

    }

    //GETTERS AND SETTERS
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    //FUNÇÃO
    public void addProduto(String nomeProduto, double preco){
        itens.setProduto(nomeProduto, preco);

        total += preco;
    }

    //ToString
    public String toString(){
        return "Pedido\n"+
                 desc+
                "\nData: " + data +
                "\n" + itens+
                "\n Total: " + total;
    }


}
