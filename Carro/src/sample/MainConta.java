package sample;

import sample.model.Conta;

public class MainConta {
    public static void main(String[] args) {

        Conta conta = new Conta("123456789", "987654321");

        conta.Depositar(50.50);
        conta.Depositar(50.50);
        conta.Sacar(20);


        System.out.println(conta.extrato());

    }
}
