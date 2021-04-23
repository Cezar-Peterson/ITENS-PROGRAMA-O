package sample.model;

public class Pedido {
    private String desc;
    private String data;
    private double total;
    private ItensDoPedido itens;

    public Pedido(){
        itens = new ItensDoPedido();

    }

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

    public void addProduto(String nomeProduto, double preco){
        itens.setProduto(nomeProduto, preco);

        total += preco;
    }

    public String toString(){
        return "Pedido\n"+
                 desc+
                "\nData: " + data +
                "\n" + itens+
                "\n Total: " + total;
    }


}
