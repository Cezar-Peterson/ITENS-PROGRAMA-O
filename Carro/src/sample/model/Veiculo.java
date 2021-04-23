package sample.model;

public class Veiculo {
    //atributos
    public String placa;
    public int velocidade;

    //CONSTRUTOR
    public Veiculo(String placa){
        this.placa = placa;
        this.velocidade = 0;
    }

    //MÉTODOS
    public String consultarPlaca(){
        return placa;
    }

    //function acelerar(){ velocidade += 10}

    public int acelerar(int valor){
        this.velocidade += valor;
        return this.velocidade;
    }

    public int frear(int valor){
        if(this.velocidade < valor){
            this.velocidade =0;
            return this.velocidade;
        }else{
            this.velocidade -= valor;
            return this.velocidade;
        }

    }

    //function consultarVelocidade(){ console.log velocidade}
    public int consultarVelocidade(){
        return velocidade;
    }

}
