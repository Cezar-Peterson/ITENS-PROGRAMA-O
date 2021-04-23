package sample.model4;

public abstract class Pessoa {
    //ATRIBUTOS
    private String nome;
    private int idade;

    //CONSTRUTORES
    public Pessoa(String nome, double nota1, double nota2){
        this.nome = nome;
    }
    public Pessoa(String nome,int horasTrabalhadas, double valorHora){
        this.nome = nome;
    }
    public Pessoa(String nome, double valorHora, int horasTrabalhadas, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    //ToString
    @Override
    public String toString() {
        return "\n\nPessoa" +
                "\nnome: " + nome + ((idade == 0)?"":"\nIdade: " + idade)
                 ;
    }

}
