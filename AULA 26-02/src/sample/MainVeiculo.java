package sample;

import sample.model.Veiculo;

public class MainVeiculo {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("abc-1234" );
        System.out.println("Placa: "+ veiculo.consultarPlaca());
        System.out.println("Velocidade: "+ veiculo.consultarVelocidade());
        //System.out.println("Acelerar: "+ veiculo.acelerar(20));
        //System.out.println("Acelerar: "+ veiculo.acelerar(60));
        //System.out.println("Frear: "+veiculo.frear(30));
        //System.out.println("Frear: "+veiculo.frear(35));
        //System.out.println("Frear: "+veiculo.frear(40));
        //System.out.println("Frear: "+veiculo.frear(40));
        //MEU System.out.println("Velocidade: " + veiculo.acelerar());


        while(veiculo.consultarVelocidade() <200){

            System.out.println("Acelerando...."+ veiculo.acelerar(1));
        }


        while (veiculo.consultarVelocidade()>0){
            System.out.println("Freando... "+ veiculo.frear(10));
        }
    }
}
