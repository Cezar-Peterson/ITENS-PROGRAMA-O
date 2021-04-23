package sample.model;

public class Contato {
    //ATRIBUTOS
private String whatsapp;
private String email;
private String twitter;

    //GETTERS AND SETTERS
    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    //ToString
    @Override
    public String toString() {
        return "\n\nContato" +
                "\nwhatsapp: " + whatsapp +
                "\nemail: " + email +
                "\ntwitter: " + twitter ;
    }
}
