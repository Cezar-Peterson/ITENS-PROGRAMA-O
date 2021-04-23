package sample;

import sample.model.Produto;

import java.util.ArrayList;

public class MainProduto {

    public static void main(String[] args) {

        //LISTA DE PRODUTOS
        ArrayList<Produto> produtos = new ArrayList<>();

        //Produto 1
        Produto produto = new Produto();
        produto.setNome("Maçã");
        produto.setPreco(3.6);
        System.out.println(produto);

        //produto 2
        Produto produto2 = new Produto();
        produto2.setNome("Laranja");
        produto2.setPreco(2.5);

        //produto 3
        Produto produto3 = new Produto();
        produto3.setNome("Uva");
        produto3.setPreco(5.7);

        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println(produtos);

        produtos.remove(produto2);
        System.out.println(produtos);

}
}
