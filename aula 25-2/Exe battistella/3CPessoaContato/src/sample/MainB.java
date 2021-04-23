package sample;

import sample.model.BPessoa;


public class MainB {
    public static void main(String[] args) {
        BPessoa bPessoa = new BPessoa("cezar");
        bPessoa.setContato("89-999-111110", "email@gmail.com", "não tenho");
        System.out.println(bPessoa);



    }
}
