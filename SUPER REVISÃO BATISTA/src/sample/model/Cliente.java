package sample.model;

public class Cliente extends Pessoa{
    //ATRIBUTOS
    private String email;

    //CONSTRUTORES
    public Cliente(String nome) {
        super(nome);
    }
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }
    public Cliente(String nome, String cpf, String email){
        super(nome, cpf);
        this.email = email;
    }

    //GETTERS AND SETTERS
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() +
                "\nEmail: " + email ;
    }
}
