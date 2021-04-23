package sample.model2;

public class Endereco {

    //ATRIBUTOS
    private String rua;
    private int numero;
    private String bairro;
    private String cep;

    //GETTERS AND SETTERS
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    //ToString
    @Override
    public String toString(){
        return "\nEndereço"+
                "\n Rua: " + rua+
                "\n Numero: " + numero+
                "\n Bairro: "+ bairro+
                "\n Cep: "+ cep;

    }

}
