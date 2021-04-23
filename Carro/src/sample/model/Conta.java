package sample.model;

public class Conta {
    //atributos
    public double saldo;
    public String numeroConta;
    public String numeroAgencia;

    //CONSTRUTOR
    public Conta(String numeroConta, String numeroAgencia){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;

    }

    //MÉTODOS
    public double Depositar(double valorDeposito){
        this.saldo += valorDeposito;
        return this.saldo;
    }

    public double Sacar(double valorSaque){
        this.saldo -= valorSaque;
        return this.saldo;
    }

    public String extrato(){
        return "EXTRATO"+
                "\nNumero da conta: " + numeroConta +
                "\nNumero da angencia: " + numeroAgencia +
                "\nSaldo: "+saldo;


    }
}
