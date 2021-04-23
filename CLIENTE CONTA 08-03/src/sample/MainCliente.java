package sample;

import sample.model.Cliente;
import sample.model.Conta;

public class MainCliente {
    public static void main(String[] args) {
        Conta conta = new Conta(1234,4566);
        conta.depositar(3000);

        Cliente cliente = new Cliente();
        cliente.setConta(conta);
        cliente.setNome("Laura");
        cliente.setCpf("432.112.222-09");

        System.out.println(cliente);
    }
}
