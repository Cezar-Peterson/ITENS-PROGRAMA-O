package sample.model;

public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private String dataNascimento;
    private Endereco endereco;

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setEndereco(String rua, int numero, String bairro, String cidade){
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        this.setEndereco(endereco);
    }

    //ToString
    @Override
    public String toString() {
        return "Nome: " + this.nome
                + ", Nascimento: " + dataNascimento + "\n"
                + "Endereço: " + endereco;
    }
}
