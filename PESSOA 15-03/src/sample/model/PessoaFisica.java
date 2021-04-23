package sample.model;

public final class PessoaFisica extends Pessoa{

    //CONSTRUTOR
    public PessoaFisica(String nome){
        super(nome);
    }

    //ATRIBUTOS
    private String cpf;
    private String rg;

    //GETTERS AND SETTERS
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + "\ncpf: " + cpf + "\nrg: " + rg;
    }
}
