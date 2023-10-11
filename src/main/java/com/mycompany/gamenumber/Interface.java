package com.mycompany.gamenumber;

public class Interface {

    Tabuleiro ta = new Tabuleiro();
    Movimentos mov = new Movimentos();
    ControladorGame game = new ControladorGame();
    public void menu(){
        ta.tabuleiroComparador[2][0]=48;
        System.out.println("Jogo 2048");
        System.out.println("Pontos : 0");
        System.out.println("===================");
        ta.checar();
        ta.checar();
        ta.inprimir();
        System.out.println("===================");
        for (int h = 0; h < 2;) {
            ta.copiador();
            mov.movi(ta);
            System.out.println("=======================================");
            System.out.println("Pontos :" + mov.pontos);
            System.out.println("===================");
            ta.inprimir();
            System.out.println("===================");
            System.out.print("\n\n");
            System.out.println("===================");
            ta.checar();
            ta.inprimir();
            System.out.println("===================");
            System.out.println("=======================================");
            if(game.gameWiner(ta)==true){
                System.out.println("===================");
                System.out.println("Game Winner");
                System.out.println("===================");
                break;}
            if(game.over(ta)==true){
                System.out.println("===================");
                System.out.println("Game Over");
                System.out.println("===================");
                break;}
        
            
            

        }

    }
}
