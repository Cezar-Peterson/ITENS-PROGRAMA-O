package sample.model;

public class Pessoa {

    //atributos
    private String nome;
    private String dataNascimento;

    //métodos


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

    @Override
    public String toString() {
        return "Pessoa" +
                "\nNome: " + nome +
                "\nData Nascimento: " + dataNascimento
                ;
    }
}
