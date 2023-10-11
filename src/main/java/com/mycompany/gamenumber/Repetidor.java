package com.mycompany.gamenumber;

public class Repetidor {

    public boolean repetirDireita(Tabuleiro tab) {
        boolean repita = true;
        int check = 1;
        for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                if (tab.tabuleiro[linha][coluna] != 0) {
                    if (coluna < 3) {
                        if (tab.tabuleiro[linha][coluna + 1] == 0) {
                            check = 2;
                        }
                    }
                }
            }
        }
        if (check == 2) {
            repita = false;
        }
        return repita;
    }

    public boolean repetirCima(Tabuleiro tab) {
        boolean repita = true;
        int check = 1;
        for (int linha = 3; linha > 0; linha--) {
            for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                if (tab.tabuleiro[linha][coluna] != 0) {
                    if (linha > 0) {
                        if (tab.tabuleiro[linha - 1][coluna] == 0) {
                            check = 2;
                        }
                    }
                }
            }
        }
        if (check == 2) {
            repita = false;
        }
        return repita;
    }

    public boolean repetirEquerda(Tabuleiro tab) {
        boolean repita = true;
        int check = 1;
        for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
            for (int coluna = 3; coluna > 0; coluna--) {
                if (tab.tabuleiro[linha][coluna] != 0) {
                    if (coluna > 0) {
                        if (tab.tabuleiro[linha][coluna - 1] == 0) {
                            check = 2;
                        }
                    }
                }
            }
        }
        if (check == 2) {
            repita = false;
        }
        return repita;
    }

    public boolean repetirBaixo(Tabuleiro tab) {
        int check = 1;
        boolean repita = true;
        for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                if (tab.tabuleiro[linha][coluna] != 0) {
                    if (linha < 3) {
                        if (tab.tabuleiro[linha + 1][coluna] == 0) {
                            check = 2;
                        }
                    }
                }
            }
        }
        if (check == 2) {
            repita = false;
        }
        return repita;
    }
}
