package sample.model4;

public class Professor extends Pessoa{
    //ATRIBUTOS
    private int horasTrabalhadas;
    private double valorHora;
    private double salario;

    //CONSTRUTORES
    public Professor(String nome, int horasTrabalhadas, double valorHora){
        super(nome, horasTrabalhadas, valorHora);
        this.salario = (valorHora * horasTrabalhadas);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public Professor(String nome, int horasTrabalhadas, double valorHora, int idade){
        super(nome, horasTrabalhadas, (int) valorHora, idade);
        this.salario = (valorHora * horasTrabalhadas);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    //GETTERS AND SETTERS
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() +
                "\nHoras Trabalhadas: " + ((horasTrabalhadas>24)?"IMPOSSIVEL SER "+ horasTrabalhadas: horasTrabalhadas+" por dia" ) +
                "\nValor Hora: " + valorHora +
                "\nSalario: " + salario*30 ;
    }
}
