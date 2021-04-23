package sample;


import sample.model.Conta;

public class Main{

    public static void main(String[] args) {
        Conta conta = new Conta(5678, 123456);
        if (conta.sacar(200)) {
            System.out.println("Sacou R$200 ");
        }else{
            System.out.println("Não tem limite");
        }

        conta.depositar(100);
        conta.depositar(200);
        conta.depositar(200);


        System.out.println(conta);
    }



}
