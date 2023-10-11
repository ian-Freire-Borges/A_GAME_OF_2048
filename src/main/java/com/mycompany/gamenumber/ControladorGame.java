package com.mycompany.gamenumber;

public class ControladorGame {

    public boolean over(Tabuleiro tab) {
        int checkOver = 0;
        boolean over = true;
        for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                if (tab.tabuleiro[linha][coluna] != 0) {

                    if (coluna == 3) {

                    } else if (tab.tabuleiro[linha][coluna] == tab.tabuleiro[linha][coluna + 1]) {
                        checkOver = 1;
                    } else if (tab.tabuleiro[linha][coluna] != tab.tabuleiro[linha][coluna + 1] && tab.tabuleiro[linha][coluna + 1] != 0) {

                    } else if (tab.tabuleiro[linha][coluna + 1] == 0) {
                        checkOver = 1;
                    }
                }
            }
        }
        for (int linha = 3; linha > 0; linha--) {
            for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                if (tab.tabuleiro[linha][coluna] != 0) {

                    if (linha == 0) {

                    } else if (tab.tabuleiro[linha][coluna] == tab.tabuleiro[linha - 1][coluna]) {
                        checkOver = 1;
                    } else if (tab.tabuleiro[linha][coluna] != tab.tabuleiro[linha - 1][coluna] && tab.tabuleiro[linha - 1][coluna] != 0) {

                    } else if (tab.tabuleiro[linha - 1][coluna] == 0) {
                        checkOver = 1;
                    }
                }
            }
        }
        for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
            for (int coluna = 3; coluna > 0; coluna--) {
                if (tab.tabuleiro[linha][coluna] != 0) {

                    if (coluna == 0) {

                    } else if (tab.tabuleiro[linha][coluna] == tab.tabuleiro[linha][coluna - 1]) {
                        checkOver = 1;
                    } else if (tab.tabuleiro[linha][coluna] != tab.tabuleiro[linha][coluna - 1] && tab.tabuleiro[linha][coluna - 1] != 0) {

                    } else if (tab.tabuleiro[linha][coluna - 1] == 0) {
                        checkOver = 1;
                    }
                }
            }
        }
        for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                if (tab.tabuleiro[linha][coluna] != 0) {

                    if (linha == 3) {

                    } else if (tab.tabuleiro[linha][coluna] == tab.tabuleiro[linha + 1][coluna]) {
                        checkOver = 1;
                    } else if (tab.tabuleiro[linha][coluna] != tab.tabuleiro[linha + 1][coluna] && tab.tabuleiro[linha + 1][coluna] != 0) {

                    } else if (tab.tabuleiro[linha + 1][coluna] == 0) {
                        checkOver = 1;
                    }
                }
            }
        }
        if (checkOver == 1) {
            over = false;
        }
        return over;
    }

    public boolean gameWiner(Tabuleiro tab) {
        boolean winner = false;
        for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                if (tab.tabuleiro[linha][coluna] == 2048) {
                    winner = true;
                }
            }
        }
        return winner;
    }

   
}
