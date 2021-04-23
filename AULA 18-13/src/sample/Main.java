package sample;

import sample.model.Caminhao;
import sample.model.Carro;

public class Main  {
    public static void main(String[] args) {
        Carro carro = new Carro("Opala");
        carro.setMarca("chevrolet", "Braba");
        carro.setPortas(2);

        System.out.println(carro);

        Caminhao caminhao = new Caminhao("FH 750");
        caminhao.setMarca("Volvo" , "Poderosa");
        caminhao.setEixos(10);

        System.out.println(caminhao);

        Caminhao caminhao1 = new Caminhao("FH", 540);
        caminhao1.setMarca("volvo", "poderosa");
        caminhao1.setEixos(10);

        System.out.println(caminhao1);

        Carro carro1 = new Carro("Opala SS", 140);
        carro1.setMarca("Chevrolet", "Teve verdadeiros carros de respeito");
        carro1.setPortas(2);
        System.out.println(carro1);
    }
}
