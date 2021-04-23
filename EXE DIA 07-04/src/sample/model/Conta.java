package sample.model;
import java.util.Scanner;
public class Conta {
    // SCANNER
    Scanner valores1 = new Scanner(System.in);

    // ATRIBUTOS
    protected String numeroConta;
    private String nomeTitular;
    protected double saldo;
    public double valor;


    // CONSTRUTOR
    public Conta(String numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0;

    }

    //GETTERS AND SETTERS
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }


    //VERIFICAÇÃO
    public void simOuNao(){
        System.out.println("Haverá depósito inicial (s/n)?");
        char simOuNao = valores1.next().charAt(0);
        if (simOuNao == 'n' || simOuNao == 'N'){
            this.saldo += 0;
        }else if (simOuNao == 's' || simOuNao == 'S' ){
            System.out.println("Digite um valor para o deposito inicial: ");
            double depositoInicial = valores1.nextDouble();
            this.saldo += depositoInicial;
            }

    }



    // FUNÇÕES DE DEPOSITO, SAQUE E TROCAR NOME
    public double deposito(){
        System.out.println("Você solicitou um depósito, digite o valor:");
        double deposito = valores1.nextDouble();
        this.saldo += deposito;
        return saldo;
    }

    public double saque(){
        System.out.println("Você solicitou um saque, digite o valor:");
        double saque = valores1.nextDouble();
        this.saldo -= (saque+5);
        System.out.println("ATENÇÃO: O banco cobra uma taxa de 5 reais para todo saque");
        return saldo;
    }

    public String trocarNome(){
        System.out.println("Você solicitou uma troca de nome, digite o novo nome por favor:");
        String novoNome = valores1.nextLine();
        // POR ALGUM MOTIVO SEM ESSE "novoNome" O SISTEMA N ACEITA MINHA TROCA, ELE SERVE COM ISCA
        String novoNome2 = valores1.nextLine();
        this.nomeTitular = novoNome2;
        return this.nomeTitular;
    }

    //ToString
    @Override
    public String toString(){
       return  "\nDados da conta: "
               +"\nNome do titular: " + this.nomeTitular
               + ", Número da conta: " + this.numeroConta
               + ", Saldo: R$" + this.saldo
               + "\n";
    }
}
