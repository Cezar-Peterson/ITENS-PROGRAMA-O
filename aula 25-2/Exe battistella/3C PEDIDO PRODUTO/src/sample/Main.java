package sample;


import sample.model.ItensDoPedido;
import sample.model.Pedido;
import sample.model.Produto;

public class Main  {

    public static void main(String[] args) {
//        ItensDoPedido itensDoPedido = new ItensDoPedido();
//        Produto produto = new Produto();
//        produto.setNome("Laranja");
//        produto.setPreco(2.4);
//
//
//    itensDoPedido.setProduto(produto);
//
//        itensDoPedido.setProduto("uva", 4.7);
//        System.out.println(itensDoPedido);

        Pedido pedido = new Pedido();
        pedido.setDesc("Pedido do iFood");
        pedido.setData("11/03/2021");
        pedido.addProduto("Uva", 5.4);
        pedido.addProduto("Laranja", 2.6);
        pedido.addProduto("Banana", 1.6);

        System.out.println(pedido);
    }
}
