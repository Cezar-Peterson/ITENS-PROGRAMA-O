package sample;

import sample.model.Cliente;

public class MainCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("João");
        cliente.setEmail("joao@gmail.com");
        cliente.setTelefone("48-98988-1234");
        cliente.setIdade(80);

        System.out.println(cliente);

        Cliente cliente2 = new Cliente();

        cliente2.setNome("Cezar");
        cliente2.setEmail("Cezar@gmail.com");
        cliente2.setTelefone("49 98547-2587");
        cliente2.setIdade(16);
        System.out.println(cliente2);

    }
}
