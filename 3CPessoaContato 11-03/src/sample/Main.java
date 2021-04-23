package sample;


import sample.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("cezar");
        pessoa.setNome("joão");
        pessoa.setContato("48 1234-5678", "cezar@gmail.com", "@cezinha");

        System.out.println(pessoa);
    }

}
