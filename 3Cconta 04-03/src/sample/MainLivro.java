package sample;

import sample.model.Livro;

public class MainLivro {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("as aventuras de jeremias");
        livro.setAutor("cezinha");
        livro.setEditora("super editora");
        livro.setAno(2021);

        System.out.println(livro);
    }
}
