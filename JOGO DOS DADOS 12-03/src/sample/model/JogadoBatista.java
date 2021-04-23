package sample.model;

/**
 * Classe Jogador
 */
public class JogadoBatista {
    /**
     * Atributo
     */
    private String nome;
    private boolean venceu;
    private int totalPontos;

    /*
    getters and setters
     */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean isVenceu(){
        return this.venceu;
    }

    public void setVenceu(boolean venceu){
        this.venceu = venceu;
    }

    public int getTotalPontos(){
        return this.totalPontos;
    }
    public void setTotalPontos(int totalPontos){
        this.totalPontos = totalPontos;
    }

    /*
    toString
     */
    public String toString(){

        return "Jogador: "+ nome
                + ", " + (venceu?"Ganhou o jogo":"Perdeu o jogo")
                + ", pontos: " + totalPontos +"\n";
    }

}
