package sample.model;

public class BPessoa {
    //atributos
    private String nome;
    private BContato bContato;

    public BPessoa(String nome){
        this.nome = nome;

    }

    //getter and setters
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public BContato getbContato() {
        return bContato;
    }

    //poderia ser o set, mas tiramos

    public void setContato(String whatsapp, String email, String twitter){
        BContato bContato = new BContato();
        bContato.setEmail(email);
        bContato.setTwitter(twitter);
        bContato.setWhatsapp(whatsapp);
        this.bContato = bContato;
    }

    //ToString
    @Override
    public String toString() {
        return "BPessoa" +
                "\nnome: " + nome +
                bContato;
    }
}
