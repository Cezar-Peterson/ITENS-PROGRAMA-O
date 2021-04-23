package sample;

import sample.model5.Calculadora;

public class MainCalc {
    public static void main(String[] args) {
        Calculadora teste1 = new Calculadora();
        teste1.somar(15,20);
        System.out.println(teste1);

        Calculadora teste2 = new Calculadora();
        teste2.somar(15,20,26);
        System.out.println(teste2);

        Calculadora teste3 = new Calculadora();
        teste3.subtrair(20,30);
        System.out.println(teste3);

        Calculadora teste4 = new Calculadora();
        teste4.subtrair(20,30,40);
        System.out.println(teste4);

        Calculadora teste5 = new Calculadora();
        teste5.multiplicar(20,3);
        System.out.println(teste5);

        Calculadora teste6 = new Calculadora();
        teste6.multiplicar(20,3,4);
        System.out.println(teste6);

        Calculadora teste7 = new Calculadora();
        teste7.dividir(10,5);
        System.out.println(teste7);

        Calculadora teste8 = new Calculadora();
        teste8.dividir(10,5,2);

        System.out.println(teste8);

    }
}
