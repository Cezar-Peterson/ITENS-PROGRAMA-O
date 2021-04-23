package sample;

public class Triangulo {

    //atributos

    public double a;
    public double b;
    public double c;

    //Função
    public double Area(){
        double p = (a + b +c) /2.0;
        double area = Math.sqrt(p*(p-a)* (p-b)*(p-c));
        return area;
    }
}
