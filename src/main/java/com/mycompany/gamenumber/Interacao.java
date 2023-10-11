package com.mycompany.gamenumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interacao {
Scanner ian = new Scanner(System.in);
    public int movimento() {
        int movimentacao = 0;
        boolean validarImput = false;
        System.out.println("Escolha um lado para se movimentar Direita>[1] | Cima[2] | Esquerda<[3] | Baixo[4]");
        do {
            validarImput = false;
            try {
                movimentacao = ian.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha um numero");
                ian.nextLine();
                validarImput = true;
            }
            if (movimentacao <= 0 || movimentacao > 4) {
                validarImput = true;
                System.out.println("Numero deve ser entre 1 e 4");
            }
        } while (validarImput == true);
        return movimentacao;
    }

}