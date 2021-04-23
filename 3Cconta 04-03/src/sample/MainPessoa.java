package sample;

import sample.model.Pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cezar");
        pessoa.setDataNascimento("08/05/2004");

        System.out.println(pessoa);
    }
}
