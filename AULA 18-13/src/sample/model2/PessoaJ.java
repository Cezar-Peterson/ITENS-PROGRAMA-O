package sample.model2;

public class PessoaJ extends Pessoa{
    //ATRIBUTOS
    private String cnpj;
    private String ie;

    //CONSTRUTORES
    public PessoaJ(String nome){
        super(nome);
    }

    public PessoaJ(String nome, String datadeFundacao){
        super(nome, datadeFundacao);
    }

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
        return super.toString() +"\nPessoa Juridica:"+ "\n CNPJ: " +cnpj+
                "\n IE: " + ie;
    }
}
