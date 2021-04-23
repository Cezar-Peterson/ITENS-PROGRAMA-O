package sample;

import sample.model.Produto;
import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Entre com os dados do produto");
        System.out.println("Nome:");
        produto.Nome = leitura.nextLine();

        System.out.println("Preço: ");
        produto.Preco = leitura.nextDouble();

        System.out.println("Quantidade no estoque:");
        produto.Quantidade = leitura.nextInt();

        System.out.println("Dados do produto: \n"+ produto.imprimir());

        System.out.println("Digite o número de produtos a ser adicionado ao estoque: ");
        int qtd = leitura.nextInt();
        produto.AdicionarProdutos(qtd);
        System.out.println("Dados atualizados: \n"+ produto.imprimir());

        System.out.println("Digite o número de produtos a ser removido do estoque: ");
        qtd = leitura.nextInt();
        produto.RemoverProdutos(qtd);
        System.out.println("Dados atualizados: \n"+ produto.imprimir());


    }
}
