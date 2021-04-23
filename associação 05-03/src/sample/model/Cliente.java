package sample.model;

public class Cliente {
    //ATRIBUTOS
    private String nome;
    private String cpf;
    private Conta conta;

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setConta(double saldo, double limite, int numero, double valorDeposito, double valorSaque){
        Conta conta = new Conta();
        conta.Depositar(valorDeposito);
        conta.Sacar(valorSaque);
        conta.setSaldo(saldo);
        conta.setLimite(limite);
        conta.setNumero(numero);
        this.setConta(conta);
    }

    //ToString
    @Override
    public String toString() {
        return "Cliente " +
                "nome: " + nome +
                "\ncpf: " + cpf +
                "Conta: "+ conta;
    }
}
