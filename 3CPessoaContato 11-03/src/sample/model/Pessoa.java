package sample.model;

public class Pessoa {

    //ATRIBUTOS
    private String nome;
    private Contato contato;

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

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setContato(String whatsapp, String email, String twitter){
        Contato contato = new Contato();
        contato.setWhatsapp(whatsapp);
        contato.setTwitter(twitter);
        contato.setEmail(email);
        this.contato = contato;

    }

    //ToString
    @Override
    public String toString() {
        return "Pessoa" +
                "\nNome: " + nome+
                contato
                ;
    }
}
