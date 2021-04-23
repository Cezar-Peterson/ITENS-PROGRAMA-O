package sample;

public class exe6 {
    public static void main(String[] args) {
    //VETORES
        int[] array1 = {17,16,10,22,56,78,15,69,10,32};
        int menor = array1[0];
        int qtde = 0;

        //FOR 1
        for (int i = 0; i<10;i++){

            if(array1[i]< menor ){
                menor = array1[i];
            }
        }
        System.out.println("a pessoa mais nova tem: "+menor+" anos");

        //FOR 2
        for (int i = 0; i<10;i++){

            if(array1[i] == menor ){
                qtde++;
            }
        }
        System.out.println("A quantidade de pessoas que possuem a menor idade são: "+ qtde);

    }


}
