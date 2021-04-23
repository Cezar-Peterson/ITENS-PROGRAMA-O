package sample;

import sample.model.Ingredientes;
import sample.model.Receita;

import java.util.ArrayList;

public class MainRI {
    public static void main(String[] args) {

        ArrayList<Receita> produtos = new ArrayList();

        Receita receita = new Receita();
        receita.setNome("churrasco");
        receita.setDescricao("muita carne");
        receita.setIngredientes("Picanha", 2, "Kg");

        Receita receita2 = new Receita();
        receita2.setNome("arroz e feijão");
        receita2.setDescricao("bom");
        receita2.setIngredientes("arroz e feijão", 3, "Kg");

        produtos.add(receita);
        produtos.add(receita2);

        System.out.println(produtos);

    }

}
