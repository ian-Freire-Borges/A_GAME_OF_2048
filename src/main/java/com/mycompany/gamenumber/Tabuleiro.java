package com.mycompany.gamenumber;

public class Tabuleiro {

    int tabuleiro[][] = new int[4][4];
    int tabuleiroComparador[][] = new int[4][4];
    GerarNumber num = new GerarNumber();

    public void inprimir() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                System.out.print("[ " + tabuleiro[linha][coluna] + " ]");
            }
            System.out.println("");
        }
    }

    public void checar() {
        if(verificadorCopia()==true){
        int full=1;
        boolean check = true;
        while (check == true) {
            int p1 = num.aleatori();
            int p2 = num.aleatori();
            check = false;
            if (tabuleiro[p1][p2] == 0) {
                tabuleiro[p1][p2] = num.aleatori2();
            } else {
                check = true;
            }
            for (int linha = 0; linha < tabuleiro.length; linha++) {
                for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                    if(tabuleiro[linha][coluna]==0){
                        full=2;
                    }
                }
                
            }
            if(full==1){
                break;}
        }
        }
    }
     public void copiador() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                tabuleiroComparador[linha][coluna] = tabuleiro[linha][coluna];
            }
        }
    }

    public boolean verificadorCopia() {
        boolean verificaSemelhanca = false;
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                if (tabuleiroComparador[linha][coluna] != tabuleiro[linha][coluna]) {
                    verificaSemelhanca = true;
                }
            }
        }
        return verificaSemelhanca;
    }
}
