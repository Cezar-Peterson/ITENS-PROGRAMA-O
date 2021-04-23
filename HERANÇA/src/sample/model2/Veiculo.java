package sample.model2;

public abstract class Veiculo {

    //ATRIBUTOS
    private String nome;
    private Marca marca;
    private String desc;

    //CONTAS
    public Veiculo(String nome){
        this.nome = nome;
    }
    public Veiculo(String nome, String desc){
        this.nome = nome;
        this.desc = desc;
    }

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    //SET COM HERANÇA
    public void setMarca(String nome, String desc) {
        Marca marca1 = new Marca();
        marca1.setNome(nome);
        marca1.setDesc(desc);
        this.marca = marca1;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //ToString
    @Override
    public String toString() {
        return "\n"+nome +"\nMarca: " + marca+
                ((desc == null) ? "" : desc + "\n");
    }
}
