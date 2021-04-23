package sample;


import sample.model.Receita;

public class Main {

    public static void main(String[] args) {
        Receita receita = new Receita();
        receita.setNome("Bolo da Marcia");
        receita.setDescricao("Foi a Laura que fez");
        receita.setIngrediente("tal",300,"g");
        receita.setIngrediente("t2al",30000,"g");
        System.out.println(receita);
    }
}
