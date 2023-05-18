package tictactoe;

import java.util.Scanner;

public class Player {
    String name;
    char playerSymbol;

    public Player(String name, char playerSymbol) {
        this.name=name;
        this.playerSymbol = playerSymbol;
    }

    public static Player createsNewPlayer(){
        String name;
                Scanner scan = new Scanner(System.in);
                char playerSymbol;
        System.out.println("Input name:");
        name = scan.next();
        System.out.println("Input your symbol (cannot be number):");
        playerSymbol = scan.next().charAt(0);
        while (Character.isDigit(playerSymbol)){
            System.out.println("This symbol is number. Symbol cannot be number.\n Insert proper symbol");
            playerSymbol= scan.next().charAt(0);
        }
        return new Player (name,playerSymbol);
    }
    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append("Player name:").append(name).append("\nPlayer symbol:")
               .append(playerSymbol).append("\n");
       return sb.toString();
    }
}