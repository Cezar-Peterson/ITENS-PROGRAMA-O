package sample;


import sample.model.Cliente;
import sample.model.Pedido;
import sample.model.Produto;

public class Main{


    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Santiago");
        cliente1.setCpf("200.900.111.90");
        cliente1.setEndereco("Sete de setembro", 12);
        cliente1.setEmail("Santiago@gmail.com");
        Cliente cliente2 = new Cliente("Raul Seixas", "888.999.111.90");

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente1);
        pedido.setProduto("Uva", 3.6);
        pedido.setProduto("Laranja", 2.1);
        pedido.setProduto("Pera", 3.5);
        pedido.setData("22/03/2021");


        System.out.println(pedido);
    }
}
