package sample.model;

import java.util.Random;

public class DadoBatista {
/**
 * Atributo
  */
    private int face;

    /**
     * CONSTRUTOR INICIALIZANDO COM 0
     */

    public DadoBatista(){
        this.face = 0;
    }
    /**
     * Lançar dado e gerar número randomicamente
     */

    public void lancar(){
        Random random = new Random();
        //this.face = random.nextInt(6)+1;
        this.face = random.nextInt(7);

        //random = 6 => 0,1,2,3,4,5
        //random = 7 => 0,1,2,3,4,5,6

        while (this.face == 0){
            this.face = random.nextInt(7);

        }
    }
    /**
     * Pegar o valor da face
     */

    public int getFace(){
        return this.face;
    }


    @Override
    public String toString() {
        return String.valueOf(this.face);
        //passar para string
    }
}
