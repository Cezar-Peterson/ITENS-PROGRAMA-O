package sample;

public class exe7 {
    public static void main(String[] args) {
        //ATRIBUTOS
        String[] g = {"a", "b", "e", "d", "a", "b", "e", "c", "a", "c"};
        String[] r = {"a", "e", "c", "b", "a", "a", "e", "c", "b", "c"};
        int nota = 10;

        //FOR
        for (int i = 0; i<g.length; i++){
            if (g[i] != r[i]){
                System.out.println("O aluno errou a questão "+ (i+1));
                nota--;
            }


        }
        if (nota>=6){
            System.out.println("aluno aprovado com nota: " +nota);
        }else{
            System.out.println("aluno reprovado com nota: "+nota);
        }

    }
}
