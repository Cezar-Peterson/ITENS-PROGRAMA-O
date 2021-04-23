package sample.model;

public class Conta {
    //ATRIBUTOS
    private double saldo;
    private double limite;
    private int numero;

    //GETTERS AND SETTERS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double Depositar(double valorDeposito){
        this.saldo +=valorDeposito;
        return saldo;
    }
    public double Sacar(double valorSaque){

        this.saldo -= valorSaque;
        return saldo;
    }

    //ToString
    @Override
    public String toString() {
        return "\n\nConta " +
                "\nsaldo: " + saldo +
                "\nlimite: " + limite +
                "\nnumero: " + numero
                ;
    }
}
