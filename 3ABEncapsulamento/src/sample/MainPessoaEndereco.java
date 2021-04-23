package sample;

import sample.model.Endereco;
import sample.model.Pessoa;

public class MainPessoaEndereco {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setDataNascimento("12/4/2001");

        Endereco endereco = new Endereco();
        endereco.setRua("Sete de setembro");
        endereco.setNumero(109);
        endereco.setBairro("Centro");
        endereco.setCidade("Florianópolis");

        pessoa.setEndereco(endereco);

        System.out.println(pessoa);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setDataNascimento("12/06/2000");
        pessoa2.setEndereco("Rio Branco", 354, "Centro", "Florianópolis");
        System.out.println(pessoa2);

    }
}
