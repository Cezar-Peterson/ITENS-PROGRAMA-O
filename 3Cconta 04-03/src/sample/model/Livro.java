package sample.model;

public class Livro {

    //atributos
    private String titulo;
    private String autor;
    private String editora;
    private int ano;

    //métodos


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro" +
                "\ntitulo: " + titulo +
                " \nautor: " + autor +
                " \neditora: " + editora +
                " \nano: " + ano
                ;
    }
}
