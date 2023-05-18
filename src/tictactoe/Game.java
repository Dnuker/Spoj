package tictactoe;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        String name;
        char playerSymbol;
        Scanner scan = new Scanner(System.in);
        Map map1 = new Map();
        System.out.println("Player One");
        Player playerOne = Player.createsNewPlayer();
        System.out.println("Player Two");
        Player playerTwo = Player.createsNewPlayer();

        System.out.println(playerOne.toString());
        System.out.println(playerTwo.toString());
        System.out.print(map1);



    }
}
