package sample;

import sample.model.Livro;

public class MainLivro {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setTitulo("Senhor das Aneis");
        System.out.println("Título: " + livro.getTitulo());

        livro.setAutor("J. R. R. Tolkien");
        System.out.println("Autor: " + livro.getAutor());
        livro.setEditora("Allen & Unwin");
        System.out.println("Editora: " + livro.getEditora());
        livro.setAno(1937);
        System.out.println("Ano: " + livro.getAno());

        System.out.println("\n\n " + livro);

    }
}
