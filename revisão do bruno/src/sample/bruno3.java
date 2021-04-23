package sample;
//FEITO PELO BRUNO
public class bruno3 {
    public static void main(String[] args) {
        imp();
    }
    //FUNÇÃO 1
    public static void imp(){
        for (int i = 1; i<=100; i++){
            System.out.println(i + " ");
        }
        imp2();
    }

    //FUNÇÃO 2
    public static void imp2(){
        for (int i = 1; i<=100; i++){
            System.out.print((i+100) + " ");
        }
    }
}
