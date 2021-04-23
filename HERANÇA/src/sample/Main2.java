package sample;

import sample.model2.Caminhao;
import sample.model2.Carro;

public class Main2 {
    public static void main(String[] args) {

        Carro carro = new Carro("fiesta");
        carro.setMarca("ford", "A empresa...");
        carro.setDesc("Carro do prof");
        carro.setnPortas(4);

        System.out.println(carro);

        Carro carro2 = new Carro("Palio");
        carro2.setMarca("fiat", "A empresa...");
        carro2.setnPortas(4);

        System.out.println(carro2);

        Caminhao caminhao = new Caminhao("S460");
        caminhao.setMarca("Scania", "A empresa...");
        caminhao.setnEixos(6);

        System.out.println(caminhao);

        Carro carro3 = new Carro("Corsa", "Meu corsinha", 2);
        carro3.setMarca("Chevrolet", "minha fábrica");
        System.out.println(carro3);

        Carro carro1 = new Carro("Corsa", "teste", 3);
        System.out.println(carro1);
    }
}
