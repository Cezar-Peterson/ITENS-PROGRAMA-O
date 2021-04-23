package sample.model3;

public class Funcionario extends Pessoa{
    //ATRIBUTOS
    private String funcao;
    private double salario;

    //CONSTRUTORES
    public Funcionario(String nome){
        super(nome);
    }
    public Funcionario(String nome, String sobrenome){
        super(nome,sobrenome);
    }

    public Funcionario(String nome, String sobrenome, int tempodeExperiencia){
        super(nome,sobrenome, tempodeExperiencia);
    }

    //GETTERS AND SETTERS
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //ToString
    @Override
    public String toString(){
        return super.toString()+
                "\nFunção: " + funcao+
                "\nSalário: R$"+ salario+"\n";
    }
}
