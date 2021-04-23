package sample;

import sample.model2.PessoaF;
import sample.model2.PessoaJ;

public class MainP {
    public static void main(String[] args) {
        PessoaF pessoaF = new PessoaF("cezar");
        pessoaF.setCpf("25846578925");
        pessoaF.setRg("654646514");
        pessoaF.setEndereco("Rua alguma coisa", 953, "Gaivotas", "88058573");
        System.out.println(pessoaF);

        System.out.println("\n\n\n\n");

        PessoaJ pessoaJ = new PessoaJ("Cezarius");
        pessoaJ.setCnpj("algum cnpj ai");
        pessoaJ.setIe("essa coisa aí");
        pessoaJ.setEndereco("rua tal", 952,"tal bairro", "um cep ai");
        System.out.println(pessoaJ);

        System.out.println("\n\n\n\n");

        PessoaF pessoaF1 = new PessoaF("Cezinha", 16);
        pessoaF1.setCpf("25846578925");
        pessoaF1.setRg("654646514");
        pessoaF1.setEndereco("Rua alguma coisa", 953, "Gaivotas", "88058573");
        System.out.println(pessoaF1);

        System.out.println("\n\n\n\n");

        PessoaJ pessoaJ1 = new PessoaJ("Cezar ltda", "2021");
        pessoaJ1.setIe("O IE ai");
        pessoaJ1.setCnpj("O CNPJ aí");
        pessoaJ1.setEndereco("Rua alguma coisa", 953, "Gaivotas", "88058573");
        System.out.println(pessoaJ1);

    }
}
