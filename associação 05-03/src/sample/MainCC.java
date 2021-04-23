package sample;

import sample.model.Cliente;
import sample.model.Conta;


public class MainCC {
    public static void main(String[] args) {



        Cliente cliente = new Cliente();

        cliente.setNome("cezar");
        cliente.setCpf("12345678901");
        cliente.setConta(5000,10000,159874632, 500, 100);




        System.out.println(cliente);


    }
}
