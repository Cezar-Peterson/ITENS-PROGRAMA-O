package sample;
import sample.model.EXE1;

import java.util.Scanner;

public class MainEXE1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        EXE1 e = new EXE1();
        EXE1 e2 = new EXE1();

        System.out.println("Digite o nome da primeira pessoa: ");
        e.nome = leitura.nextLine();

        System.out.println("Digite o nome da segunda pessoa: ");
        e2.nome = leitura.nextLine();

        System.out.println("Digite a idade de " + e.nome);
        e.idade = leitura.nextInt();

        System.out.println("Digite a idade de "+ e2.nome);
        e2.idade = leitura.nextInt();

        System.out.println("Dados da Primeira pessoa:\n"+e.imprimir());
        System.out.println("Dados da Segunda pessoa:\n"+e2.imprimir());

        if (e.idade > e2.idade){
            System.out.println("Pessoa mais velha: " + e.nome);
        }else if(e.idade == e2.idade){
            System.out.println("As idades são iguais");
        }else{
            System.out.println("Pessoa mais velha: " + e2.nome);
        }


    }
}
