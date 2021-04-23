package sample.model;

public class PessoaJuridica extends Pessoa {
    //CONSTRUTOR
    public PessoaJuridica(String nome){
        super(nome);
    }

    //ATRIBUTOS
    private String cnpj;
    private String ie;

    //GETTERS AND SETTERS
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + "\nCnpj: " + cnpj + "\nie: "+ ie;
    }
}
