package sample.model2;

public class PessoaF extends Pessoa{
    //ATRIBUTOS
    private String cpf;
    private String rg;

    //CONSTRUTORES
    public PessoaF(String nome) {
        super(nome);

    }

    public PessoaF(String nome, int idade) {
        super(nome, idade);

    }

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
    public String toString(){
        return super.toString() + "\nPessoa fisica: \n"+  " CPF: " + cpf +
                "\n RG: " + rg;
    }
}
