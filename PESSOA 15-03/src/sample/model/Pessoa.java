package sample.model;

public abstract class Pessoa {
    //ATRIBUTOS
    private String nome;
    private Endereco endereco;

    //CONSTRUTOR
    public Pessoa(String nome){
        this.nome = nome;
    }

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String rua, int numero, String bairro, String cep) {
        Endereco endereco1 = new Endereco();
        endereco1.setBairro(bairro);
        endereco1.setNumero(numero);
        endereco1.setRua(rua);
        endereco1.setCep(cep);
        this.endereco = endereco1;
    }

    //ToString
    @Override
    public String toString() {
        return "\nPessoa" +
                "\nnome: " + nome +"\nEndereço: \n"+ endereco;
    }
}
