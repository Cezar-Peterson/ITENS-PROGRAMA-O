package sample;
import sample.model.Conta;



public class Main {


    public static void main(String[] args) {

        // CONTA 1
        Conta conta1 = new Conta("123456");
        conta1.setNomeTitular("Cezar");
        conta1.simOuNao();
        System.out.println(conta1);


        conta1.deposito();
        System.out.println(conta1);

        conta1.saque();
        System.out.println(conta1);

        conta1.trocarNome();


        System.out.println(conta1);

        // CONTA 2 AGORA:
        System.out.println("SEGUNDA CONTA:\n\n");

        Conta conta2 = new Conta("123");
        conta2.setNomeTitular("Sofia");
        conta2.simOuNao();
        System.out.println(conta2);

        conta2.deposito();
        System.out.println(conta2);

        conta2.saque();
        System.out.println(conta2);


    }
}
