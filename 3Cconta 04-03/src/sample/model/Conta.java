package sample.model;

public class Conta {

    //atributos
    private double numAgencia;
    private double numConta;
    private double saldo;

    //meus métodos
    public void depositar(double valor){
        this.saldo += valor;
    }

    public double sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return valor;
        }else{
            return 0;
        }
    }

    //GETTERS AND SETTERS
    public double getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(double numAgencia) {
        this.numAgencia = numAgencia;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //ToString
    @Override
    public String toString() {
        return "Conta: " +
                "\nAgencia:" + numAgencia +
                ", \nConta corrente:" + numConta +
                ", \nSaldo:" + saldo;
    }
}
