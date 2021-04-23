package sample.model;

public abstract class Pessoa {
    //ATRIBUTOS
    private String nome;
    private String cpf;
    private Endereco endereco;

    //CONSTRUTORES
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEndereco(String rua, int numero) {
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        this.endereco = endereco;
    }

    //ToString
    @Override
    public String toString(){
        return nome
                + ", CPF: " + cpf
                + "\n"
                + endereco;
    }
}
