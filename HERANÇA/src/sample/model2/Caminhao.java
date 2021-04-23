package sample.model2;

public class Caminhao extends Veiculo {

    //ATRIBUTOS
    private int nEixos;

    //CONSTRUTOR
    public Caminhao(String nome) {
        super(nome);
    }

    //GETTERS AND SETTERS
    public int getnEixos() {
        return nEixos;
    }

    public void setnEixos(int nEixos) {
        this.nEixos = nEixos;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()+ "Número de eixos: " + nEixos;
    }
}
