package sample.model;

public class Contato {
    private String whatsapp;
    private String email;
    private String twitter;

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

    @Override
    public String toString() {
        return "\nContato" +
                "\nwhatsapp: " + whatsapp +
                "\nemail: " + email +
                "\ntwitter: " + twitter ;
    }
}
