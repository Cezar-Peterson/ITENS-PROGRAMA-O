package sample;
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        //SCANNER
        Scanner valores = new Scanner(System.in);

        //VETORES
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        //FOR 1
        for (int i = 0;i<5;i++){
            System.out.println("Digite o valor da casa " + i);
           vet1[i] = valores.nextInt();

        }
        System.out.print("vet1: ");

        //FOR 2
        for (int i = 0;i<5;i++) {
            System.out.print(vet1[i]+ " ");
        }
        System.out.print("\nvet2: ");

        //FOR 3
        for (int i = 4;i>=0;i--) {
            System.out.print(vet1[i]+ " ");
        }

    }
}
