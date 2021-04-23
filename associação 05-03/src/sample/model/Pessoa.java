package sample.model;

public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private String datanascimento;
    private Endereco endereco;

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setEndereco(String rua, int numero, String bairro, String cidade) {
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        this.setEndereco(endereco);
    }

    //ToString
    @Override
    public String toString() {
        return
                "nome: " + nome +
                "\ndatanascimento='" + datanascimento +
                "\nEnderço: "+endereco
                ;
    }
}
