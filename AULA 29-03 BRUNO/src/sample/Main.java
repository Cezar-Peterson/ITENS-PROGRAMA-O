package sample;

public class Main{

    public static void main(String[] args) {

        Triangulo x = new Triangulo();
         x.a = 3.0;
         x.b = 4.0;
         x.c= 5.0;

         Triangulo y = new Triangulo();
            y.a = 7.5;
            y.b= 4.5;
            y.c = 4.02;
    //double xa = 3.0, xb = 4.0, xc= 5.0;
    //double ya = 7.5, yb= 4.5, yc = 4.02;

//    double p = (x.a+x.b+x.c) / 2.0;
//    double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
//
//
//        p = (y.a+y.b+y.c) / 2.0;
//    double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
//


        double areaX = x.Area();
        double areaY = y.Area();

        System.out.println("Área de x = " + areaX);
        System.out.println("Área de y = " + areaY);

        if (areaX > areaY){
            System.out.println("Maior área: X");
        }else
            System.out.println("Maior área: Y");
    }
}
