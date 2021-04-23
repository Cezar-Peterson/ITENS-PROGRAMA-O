package sample;

import sample.model.Pessoa;

public class MainPC {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cezar");
        pessoa.setContato("cezinha", "cezar@gmail.com", "@cezarpeterson" );
        System.out.println(pessoa);
    }
}
