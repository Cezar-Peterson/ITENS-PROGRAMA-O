package sample;


import sample.model.Pessoa;


public class Main {



    public static void main(String[] args){
      Pessoa pessoa2 = new Pessoa();
      pessoa2.setNome("maria");
      pessoa2.setDatanascimento("08/05/2004");
      pessoa2.setEndereco("rio branco", 354, "Centro", "Florianópolis");
        System.out.println(pessoa2);

    }


}
