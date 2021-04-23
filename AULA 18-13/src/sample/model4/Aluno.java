package sample.model4;

public class Aluno extends Pessoa {
    //ATRIBUTOS
    private double nota1;
    private double nota2;
    private double media;

    //CONSTRUTORES
    public Aluno(String nome, double nota1, double nota2){

        super(nome,nota1,nota2);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(String nome, double nota1, double nota2, int idade){
        super(nome,nota1, (int) nota2, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //GETTERS AND SETTERS
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double CalcularMedia(){
        this. media = (nota1+nota2)/2;
        return media;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()+ "\nÉ um aluno ou aluna"+
                "\nNota 1: " + nota1+
                "\nNota 2: " + nota2+
                "\nMedia: "+ media

                ;
    }
}
