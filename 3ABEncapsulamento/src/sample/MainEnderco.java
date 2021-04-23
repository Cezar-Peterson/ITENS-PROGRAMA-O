package sample;

import sample.model.Endereco;

public class MainEnderco {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Avenida Rio Branco");
        endereco.setNumero(345);
        endereco.setBairro("Centro");
        endereco.setCidade("Florianópolis");

        System.out.println(endereco);
    }
}
