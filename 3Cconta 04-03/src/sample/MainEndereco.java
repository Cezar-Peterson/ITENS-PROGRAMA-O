package sample;

import sample.model.Endereco;

public class MainEndereco {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("rua das gaivotas");
        endereco.setNumero(953);
        endereco.setBairro("ingleses");
        endereco.setCidade("floripa");

        System.out.println(endereco);
    }
}
