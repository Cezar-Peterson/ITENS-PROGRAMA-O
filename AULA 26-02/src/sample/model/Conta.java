package sample.model;

//Class Conta
public class Conta {

    //Atributos
    String agencia;
    String contaCorrente;
    double saldo;

    //construtor
    public Conta(String agencia, String contaCorrente){
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;

    }

    //métodos
    public double consultarSaldo(){
        return this.saldo;
    }

    public String consultarExtrato(){
        return "Extrato:\n\n"
                +"Agência: "+ agencia
                +"\nConta Corrente: "+ contaCorrente
                +"\nSaldo: "+ saldo;
    }

    public double sacar(double money){
        return this.saldo += money*(-1);

    }

    public boolean depositar(double valor){
        if (valor>0){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

}
