package sample.model3;

public abstract class Pessoa {
    //ATRIBUTOS
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private int tempodeExperiencia;
    private String idade;
    //FOI COLOCADO STRING IDADE POIS SE NÃO DAVA CONFLITO NAS SOBREPOSIÇÕES, POIS JÁ HAVIA UM
    //QUE TINHA A SEQUÊNCIA DE STRING, STRING, INT

    //CONSTRUTORES
    public Pessoa(String nome){
        this.nome = nome;

    }

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;

    }
    public Pessoa(String nome, String sobrenome, int tempodeExperiencia){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempodeExperiencia = tempodeExperiencia;

    }
    public Pessoa(String nome, String sobrenome, String idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;

    }

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //ToString
    @Override
    public String toString() {
        return "Pessoa" +
                "\nNome: " + nome+" " +
                 sobrenome +
                ((idade == null)? "": "\nIdade: "+ idade + " anos")+
                "\nEmail: " + email +
                "\nTelefone: " + telefone+
                ((tempodeExperiencia == 0)? "":"\nTempo de experiência: " + tempodeExperiencia + " anos")
                ;
    }
}
