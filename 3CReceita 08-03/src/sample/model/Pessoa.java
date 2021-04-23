package sample.model;

public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private Contato contato;


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
        contato.setEmail(email);
        contato.setTwitter(twitter);
        contato.setWhatsapp(whatsapp);
        this.contato = contato;
    }

    //ToString
    @Override
    public String toString() {
        return "Pessoa" +
                "\nnome: " + nome +
                 contato;


    }
}
