package sample.model;

//classe veiculo
public class Veiculo {

    //atributos
    int velocidade;
    int aumento = 1;
    String placa;


    //Construtor
    //placa é o parametro do metodo construtor
    public Veiculo(String placa){
        this.placa = placa;
        this.velocidade = 0;
    }

    //métodos
    public String consultarPlaca(){
        return this.placa;
    }

    public int acelerar(int valor){

        /*PARTE QUE EU FIZ
        for (int i=1;i<=100;i++){
            this.velocidade += aumento;
        }
        return this.velocidade;*/

        return this.velocidade += valor;
    }

    public int frear(int valor){
        if (this.velocidade > 0){
            this.velocidade -= valor;
            //this.velocidade = this.velocidade - valor
            if (this.velocidade <0) { this.velocidade = 0; }
            }
        return  this.velocidade;
    }

    public int consultarVelocidade(){
        return this.velocidade;
    }

}
