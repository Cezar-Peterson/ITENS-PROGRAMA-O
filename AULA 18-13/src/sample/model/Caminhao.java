package sample.model;

public class Caminhao extends Veiculo {

    //ATRIBUTOS
    public int eixos;

    //CONSTRUTORES
    public Caminhao(String nome){
        super(nome);
    }

    public Caminhao(String nome, int cavalos){
        super(nome, cavalos);
        
    }

    //GETTERS AND SETTERS
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()+"\nEixos: "+ eixos;
    }
}
