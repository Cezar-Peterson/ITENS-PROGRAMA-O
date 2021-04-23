package sample;


import sample.model.Veiculo;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("abc-1234");
        //console.log() == System.out.println
        System.out.println("PLACA: "+ veiculo.consultarPlaca());
        System.out.println(veiculo.consultarVelocidade());

        /**
        System.out.println("velocidade atual: "+veiculo.acelerar(100));
        System.out.println("velocidade atual: "+veiculo.acelerar(10));
        System.out.println("velocidade atual: "+veiculo.frear(30));
        System.out.println("velocidade atual: "+veiculo.frear(30));
        System.out.println("velocidade atual: "+veiculo.frear(30));
        System.out.println("velocidade atual: "+veiculo.frear(30));
         **/
        for(int i =0;i<10;i++){
            veiculo.acelerar(10);

            if (i%2==1){
                veiculo.frear(5);
                System.out.println("freei 5");
            }

            System.out.println("Velocidade atual: " + veiculo.velocidade);

        }
    }
}
