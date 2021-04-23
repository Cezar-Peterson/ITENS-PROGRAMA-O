package sample;



public class Main {

    public static void main(String[] args) {
        int c = produto(10,5);
        System.out.println("produto: "+c);
        System.out.println("produto: "+produto(10,15));
    }

    // function == public static
    // function produto(a,b){}==
    public static int produto(int a,int b){
        return a*b;
    }
}
