package sample;
import java.util.Scanner;
public class exe1 {

    public static void main(String[] args) {
        //SCANNER
        Scanner valores = new Scanner(System.in);

        System.out.println("Digite 2 valores inteiros");
        int c = produto(valores.nextInt(),valores.nextInt());
        System.out.println("produto: "+c);

    }
    //FUNÇÃO
    public static int produto(int a,int b){
        return a*b;
    }
}
