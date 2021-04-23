package sample;

import sample.model4.Aluno;
import sample.model4.Professor;

public class MainEXE4 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Cezar", 10, 8);
        aluno.CalcularMedia();
        System.out.println(aluno);

        Aluno aluno2 = new Aluno("Cezar de 2014", 10, 8, 10);
        aluno2.CalcularMedia();
        System.out.println(aluno2);

        Professor professor = new Professor("Batista" ,8,50);
        System.out.println(professor);

        Professor professor2 = new Professor("Batista" ,8,50, 18);
        System.out.println(professor2);
    }
}
