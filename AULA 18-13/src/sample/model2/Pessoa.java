package sample.model2;

public abstract class Pessoa {
    //ATRIBUTOS
    private String nome;
    private Endereco endereco;
    private int idade;
    private String datadeFundacao;

    //CONSTRUTORES
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, String datadeFundacao){
        this.nome = nome;
        this.datadeFundacao = datadeFundacao;
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
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        endereco.setNumero(numero);
        this.endereco = endereco;
    }

    //ToString
    @Override
    public String toString() {
        return "Pessoa: " +
                "\nnome: " + nome+
                ((idade == 0) ? "" :"\nIdade: "+ idade)+
                ((datadeFundacao == null) ? "" :"\nData de fundação: "+ datadeFundacao)+
                "\n"+
                 endereco;
    }
}
