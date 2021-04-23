package sample;


import sample.model.Conta;

public class Main {


    public static void main(String[] args){
        Conta conta = new Conta();
        conta.setNumAgencia(19999);
        conta.setNumConta(123);
        conta.depositar(100);
        conta.sacar(25);
        System.out.println(conta);
    }

}
