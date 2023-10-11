package com.mycompany.gamenumber;

public class Movimentos {

    Repetidor re = new Repetidor();
    Interacao inte = new Interacao();
    int pontos = 0;

    public void movi(Tabuleiro tab) {
        int baramento1 = 50;
        int baramento2 = 50;
        int move = inte.movimento();
        boolean negado = false;
        int repetidor = 1;
        if (move == 1) {
            do {
                for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
                    for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                        if (tab.tabuleiro[linha][coluna] != 0) {

                            negado = false;
                            if (baramento1 == linha && baramento2 == coluna) {

                                negado = true;
                            }
                            if (coluna == 3) {

                            } else if (tab.tabuleiro[linha][coluna] == tab.tabuleiro[linha][coluna + 1] && negado == false) {

                                if (tab.tabuleiro[linha][3] == tab.tabuleiro[linha][coluna] && coluna != 3 && (tab.tabuleiro[linha][2] == 0
                                        || tab.tabuleiro[linha][2] == tab.tabuleiro[linha][coluna])) {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][3] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = linha;
                                    baramento2 = 3;
                                } else if (tab.tabuleiro[linha][2] == tab.tabuleiro[linha][coluna] && coluna != 2) {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][2] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = linha;
                                    baramento2 = 2;
                                } else {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna + 1] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = linha;
                                    baramento2 = coluna + 1;
                                }

                            } else if (tab.tabuleiro[linha][coluna] != tab.tabuleiro[linha][coluna + 1] && tab.tabuleiro[linha][coluna + 1] != 0) {

                            } else if (tab.tabuleiro[linha][coluna + 1] == 0) {

                                tab.tabuleiro[linha][coluna + 1] = tab.tabuleiro[linha][coluna];
                                tab.tabuleiro[linha][coluna] = 0;
                            }
                        }
                    }
                }
            } while (re.repetirDireita(tab) == false);

        } else if (move == 2) {
            do {
                for (int coluna = 0; coluna < 4; coluna++) {
                    for (int linha = 3; linha > 0; linha--) {
                        if (tab.tabuleiro[linha][coluna] != 0) {

                            negado = false;
                            if (baramento1 == linha && baramento2 == coluna) {

                                negado = true;
                            }
                            if (linha == 0) {

                            } else if (tab.tabuleiro[linha][coluna] == tab.tabuleiro[linha - 1][coluna] && negado == false) {

                                if (tab.tabuleiro[0][coluna] == tab.tabuleiro[linha][coluna] && linha != 0 && (tab.tabuleiro[1][coluna] == 0
                                        || tab.tabuleiro[1][coluna] == tab.tabuleiro[linha][coluna])) {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna] ;
                                    tab.tabuleiro[0][coluna] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = 0;
                                    baramento2 = coluna;
                                } else if (tab.tabuleiro[1][coluna] == tab.tabuleiro[linha][coluna] && coluna != 1) {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[1][coluna] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = 1;
                                    baramento2 = coluna;
                                } else {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha - 1][coluna] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = linha - 1;
                                    baramento2 = coluna;
                                }

                            } else if (tab.tabuleiro[linha][coluna] != tab.tabuleiro[linha - 1][coluna] && tab.tabuleiro[linha - 1][coluna] != 0) {

                            } else if (tab.tabuleiro[linha - 1][coluna] == 0) {
                                tab.tabuleiro[linha - 1][coluna] = tab.tabuleiro[linha][coluna];

                                tab.tabuleiro[linha][coluna] = 0;

                            }
                        }

                    }
                }
            } while (re.repetirCima(tab) == false);

        } else if (move == 3) {
            do {
                for (int coluna = 3; coluna > 0; coluna--) {
                    for (int linha = 0; linha < 4; linha++) {
                        if (tab.tabuleiro[linha][coluna] != 0) {

                            negado = false;
                            if (baramento1 == linha && baramento2 == coluna) {

                                negado = true;
                            }
                            if (coluna == 0) {

                            } else if (tab.tabuleiro[linha][coluna] == tab.tabuleiro[linha][coluna - 1] && negado == false) {

                                if (tab.tabuleiro[linha][0] == tab.tabuleiro[linha][coluna] && coluna != 0 && (tab.tabuleiro[linha][1] == 0
                                        || tab.tabuleiro[linha][1] == tab.tabuleiro[linha][coluna])) {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][0] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = linha;
                                    baramento2 = 0;
                                } else if (tab.tabuleiro[linha][1] == tab.tabuleiro[linha][coluna] && coluna != 1) {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][1] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = linha;
                                    baramento2 = 1;
                                } else {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna - 1] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = linha;
                                    baramento2 = coluna - 1;
                                }

                            } else if (tab.tabuleiro[linha][coluna] != tab.tabuleiro[linha][coluna - 1] && tab.tabuleiro[linha][coluna - 1] != 0) {

                            } else if (tab.tabuleiro[linha][coluna - 1] == 0) {

                                tab.tabuleiro[linha][coluna - 1] = tab.tabuleiro[linha][coluna];
                                tab.tabuleiro[linha][coluna] = 0;
                            }
                        }
                    }
                }
            } while (re.repetirEquerda(tab) == false);
        }
        if (move == 4) {
            do {
                for (int linha = 0; linha < tab.tabuleiro.length; linha++) {
                    for (int coluna = 0; coluna < tab.tabuleiro[linha].length; coluna++) {
                        if (tab.tabuleiro[linha][coluna] != 0) {

                            negado = false;
                            if (baramento1 == linha && baramento2 == coluna) {

                                negado = true;
                            }
                            if (linha == 3) {

                            } else if (tab.tabuleiro[linha][coluna] == tab.tabuleiro[linha + 1][coluna] && negado == false) {

                                if (tab.tabuleiro[3][coluna] == tab.tabuleiro[linha][coluna] && linha != 3 && (tab.tabuleiro[2][coluna] == 0
                                        || tab.tabuleiro[2][coluna] == tab.tabuleiro[linha][coluna])) {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[3][coluna] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = 3;
                                    baramento2 = coluna;
                                } else if (tab.tabuleiro[2][coluna] == tab.tabuleiro[linha][coluna] && linha != 2) {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[2][coluna] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = 2;
                                    baramento2 = coluna;
                                } else {

                                    pontos += tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha + 1][coluna] = tab.tabuleiro[linha][coluna] + tab.tabuleiro[linha][coluna];
                                    tab.tabuleiro[linha][coluna] = 0;
                                    baramento1 = linha + 1;
                                    baramento2 = coluna;
                                }

                            } else if (tab.tabuleiro[linha][coluna] != tab.tabuleiro[linha + 1][coluna] && tab.tabuleiro[linha + 1][coluna] != 0) {

                            } else if (tab.tabuleiro[linha + 1][coluna] == 0) {

                                tab.tabuleiro[linha + 1][coluna] = tab.tabuleiro[linha][coluna];
                                tab.tabuleiro[linha][coluna] = 0;
                            }
                        }
                    }
                }
            } while (re.repetirBaixo(tab) == false);

        }
    }
}

