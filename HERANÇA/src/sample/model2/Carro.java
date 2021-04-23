package sample.model2;

public final class Carro extends Veiculo{
    //CONSTRUTORES
    public Carro(String nome) {
        super(nome);

    }
    public Carro(String nome, String desc){
        super(nome, desc);
    }
    public Carro(String nome, String desc, int nPortas){
        super(nome,desc);
        this.nPortas = nPortas;
    }

    //ATRIBUTOS
    private int nPortas;

    //GETTERS AND SETTERS
    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()+ "Número de Portas: " + nPortas;
    }
}
