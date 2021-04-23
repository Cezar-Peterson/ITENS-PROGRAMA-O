package sample.controller;

import sample.model.DadoBatista;
import sample.model.JogadoBatista;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe tabuleiro
 */
public class Tabuleiro {

    /**
     * Atributos
     */
    List<JogadoBatista> jogadores;
    /*
    Contrutor
     */
    public Tabuleiro(List<String> nomesJogadores){
    jogadores = new ArrayList<>();


        for (int i = 0; i < nomesJogadores.size(); i++){
            JogadoBatista jogador = new JogadoBatista();
            jogador.setNome(nomesJogadores.get(i));

            jogadores.add(jogador);
        }
    }

    /**
     * Iniciar rodada
     */
    public void jogar(){
        for (int i = 0; i < jogadores.size();i++){
            // para cada jogar cria-se 2 dados
            DadoBatista dado = new DadoBatista();
            DadoBatista dado2 = new DadoBatista();

            dado.lancar();
            dado2.lancar();
            //calcular total dos valores da face e salvar em jogador
            jogadores.get(i).setTotalPontos(dado.getFace()+ dado2.getFace());
            // boolean venceu = jogadores.get(i).getTotalPontos() == 7
            // jogadores.get(i).setVenceu(venceu)
            jogadores.get(i).setVenceu(jogadores.get(i).getTotalPontos() == 7);
        }
    }

    /**
     * Imprimir
     */
    public String toString(){
        return jogadores.toString();
    }
}
