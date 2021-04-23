package sample;

import sample.model.Conta;

public class Main {
    public static void main(String[] args){
        Conta conta = new Conta("1234-56",
                "873-4");
        System.out.println("Saldo: "
                + conta.consultarSaldo());
        System.out.println(conta.consultarExtrato());

        conta.depositar(5000);

        System.out.println(
                "\n Geral da conta depositando dinheiro:\n"+
                conta.consultarExtrato()

        );
        conta.sacar(500);
        System.out.println(
                "\n\nGeral final da conta:\n"+
                conta.consultarExtrato()
        );


    }


}
