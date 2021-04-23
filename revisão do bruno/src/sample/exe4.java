package sample;

public class exe4 {


    public static void main(String[] args) {
        //ARRAYS
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {10,20,30,40,50};
    int [] array3 = new int[5];

    //FOR
    for(int i = 0; i<5;i++){
        array3[i] = (array1[i]+array2[i]);
        System.out.println(array3[i]);
    }
    }
}
