package sample;

import sample.model.EXE2;
import java.util.Scanner;
public class MainEXE2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        EXE2 e = new EXE2();
        EXE2 e2 = new EXE2();
        System.out.println("Nome do primeiro funcionário: ");
        e.nome = leitura.nextLine();

        System.out.println("Nome do segundo funcionário: ");
        e2.nome = leitura.nextLine();

        System.out.println("Salário de "+e.nome);
        e.salario = leitura.nextDouble();

        System.out.println("Salário de "+e2.nome);
        e2.salario = leitura.nextDouble();

        double media = (e.salario + e2.salario)/2;

        System.out.println("Dados do primeiro funcionário:");
        System.out.println(e.imprimir());
        System.out.println("Dados do segundo funcionário:");
        System.out.println(e2.imprimir());
        System.out.println("Salário médio = " + media);
    }
}
