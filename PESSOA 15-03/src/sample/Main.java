package sample;


import sample.model.PessoaFisica;
import sample.model.PessoaJuridica;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("cezar");
        pessoaFisica.setCpf("159-268-147-87");
        pessoaFisica.setRg("46546848");
        pessoaFisica.setEndereco("rua do baixo", 458,"gaivotas", "25857963");


        System.out.println(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica("cezar");
        pessoaJuridica.setCnpj("56486486");
        pessoaJuridica.setIe("156416854");
        pessoaJuridica.setEndereco("rua osvaldo seixas", 587,"centro", "25478652");

        System.out.println(pessoaJuridica);
    }
}
