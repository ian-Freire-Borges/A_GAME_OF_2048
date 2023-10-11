package com.mycompany.gamenumber;

import static java.lang.Math.random;
import java.util.Random;

public class GerarNumber {

    public int aleatori() {
        Random random = new Random();
        int posicao = random.nextInt(4);
        return posicao;
    }
     public int aleatori2() {
        Random random = new Random();
        int posicao2;
        int posicao1 = random.nextInt(6);
        if(posicao1<5){
            posicao2 = 2;
        }else{
            posicao2=4;
        }
        return posicao2;
    }

}
