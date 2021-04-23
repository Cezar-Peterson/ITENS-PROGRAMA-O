package sample;

public class exe9 {
    public static void main(String[] args) {

        //ATRIBUTOS
        int[] vetorA = {13,15,30,13,15};
        int[] vetorB = {5,5,10,8,22};
        int[] vetorC = new int[5];
        System.out.println("vetor C: ");

        //FOR
        for (int i = 0; i< vetorA.length; i++){
            vetorC[i] = (vetorA[i] - vetorB[i]);

            System.out.print(vetorC[i]+ " ");
        }
    }

}
