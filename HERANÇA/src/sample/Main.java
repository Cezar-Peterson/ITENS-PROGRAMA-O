package sample;


import sample.model.Caminhão;
import sample.model.Carro;
import sample.model.Veículo;

public class Main  {
    public static void main(String[] args) {
        Carro c1 = new Carro("Opala");
        c1.setMarca("chevrolet");
        c1.setPortas(2);

        Caminhão c2 = new Caminhão("FH 540");
        c2.setMarca("volvo");
        c2.setEixos(6);

        System.out.println(c1);
        System.out.println("\n"+c2);



    }

}
