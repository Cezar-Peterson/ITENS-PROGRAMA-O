package sample;

public class exe8 {
    public static void main(String[] args) {

        //ATRIBUTOS
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];
        int b = 0;
        int c = 0;

        //FOR1
        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i]%2 == 0){

                vetorB[b] = vetorA[i];
                b++;
            }

        }

        //FOR 2
        for (int i = 0; i<vetorB.length; i++){
            vetorC[i] = (vetorA[i]+vetorB[i]);
        }
        System.out.println("Vetor A");

        //FOR 3
        for (int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println("\n");

        System.out.println("Vetor B");

        //FOR 4
        for (int i =0;i<5;i++){

            System.out.print(vetorB[i]+" ");

        }
        System.out.println("\n");
        System.out.println("Vetor C ");

        //FOR 5
        for (int i =0;i<5;i++){

            System.out.print(vetorC[i]+ " ");

        }
    }
}
