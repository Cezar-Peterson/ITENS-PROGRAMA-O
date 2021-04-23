package sample.model;

public class Teste {
    //ATRIBUTOS
    public String nome;
    public int idade;

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //ToString
    @Override
    public String toString() {
        return "Teste{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
