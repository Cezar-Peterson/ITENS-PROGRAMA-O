package sample;

public class Main2 {
    public static void main(String[] args) {
            //vetores
        //declarar um vetor
        //let a=[]; // let a = new Array(10);
        int [] nomeVetor = new int[5]; // tamanho definido com 5, entre 0-4

        nomeVetor[0] = 0;
        nomeVetor[1] = 2;
        nomeVetor[2] = 8;
        nomeVetor[3] = 10;
        nomeVetor[4] = 30;

        for (int i = 0; i<5; i++){
        System.out.println(nomeVetor[i]);
        }

    }
}
