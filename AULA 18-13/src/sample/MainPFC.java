package sample;

import sample.model3.Cliente;
import sample.model3.Funcionario;


public class MainPFC {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        cliente.setDataCadastro("20/03/2019");
        cliente.setEmail("Cliente@gmail.com");
        cliente.setSobrenome("Batista");
        cliente.setTelefone("48 9999-8888");
        System.out.println(cliente);

        Cliente cliente2 = new Cliente("João", "Batista 2");
        cliente2.setDataCadastro("20/03/2019");
        cliente2.setEmail("Cliente@gmail.com");
        cliente2.setTelefone("48 9999-8888");
        System.out.println(cliente2);

        Cliente cliente3 = new Cliente("João", "Batista 3", "53");
        cliente3.setDataCadastro("20/03/2019");
        cliente3.setEmail("Cliente@gmail.com");
        cliente3.setTelefone("48 9999-8888");
        System.out.println(cliente3);

        Funcionario funcionario = new Funcionario("Maria");
        funcionario.setSobrenome("Eduarda");
        funcionario.setFuncao("Gerente");
        funcionario.setSalario(20000);
        funcionario.setTelefone("48 8888 9999");
        funcionario.setEmail("gerente@gmail.com");
        System.out.println(funcionario);

        Funcionario funcionario1 = new Funcionario("Maria", "Eduarda 2");
        funcionario1.setFuncao("Gerente");
        funcionario1.setSalario(20000);
        funcionario1.setTelefone("48 8888 9999");
        funcionario1.setEmail("gerente@gmail.com");
        System.out.println(funcionario1);

        Funcionario funcionario2 = new Funcionario("Maria", "Eduarda 3", 10);
        funcionario2.setFuncao("Gerente");
        funcionario2.setSalario(20000);
        funcionario2.setTelefone("48 8888 9999");
        funcionario2.setEmail("gerente@gmail.com");
        System.out.println(funcionario2);



}}
