package sample;

public class exe3 {
    public static void main(String[] args) {
        imp();
    }
    //FUNÇÃO 1
    public static void imp(){

        for (int i = 1; i<=100; i++){
            if(i%10==0) {
                System.out.print(i + "\n");
            }else{
                System.out.print(i + " ");
            }
        }
        System.out.println("-------------------------");
        imp2();
    }
    //FUNÇÃO 2
    public static void imp2(){
        for (int i = 1; i<=100; i++){
            if(i%10==0) {
                System.out.print((i+100) + "\n");
            }else{
                System.out.print((i+100) + " ");
            }
        }
        System.out.println("-------------------------");
        imp3();
    }
    //FUNÇÃO 3
    public static void imp3(){
        for (int i = 1; i<=100; i++){
            if(i%10==0) {
                System.out.print((i+200) + "\n");
            }else{
                System.out.print((i+200) + " ");
            }
        }

    }
}
