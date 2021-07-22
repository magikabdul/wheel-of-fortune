package cloud.cholewa.game.logic;

import cloud.cholewa.game.Player;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GameEngine {

    public static void run() {
        boolean loopActive = true;
        Scanner scanner = new Scanner(System.in);

        int numberOfPlayer = 0;
        List<Player> playerList;

        System.out.println("Witaj w \"Kole Fortuny\"");

        while (loopActive) {
            try {
                numberOfPlayer = GameStarter.setNumberOfPlayers(scanner);
                loopActive = false;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzona wartość nie jest liczbą!!!\n");
                scanner.nextLine();
            }
        }

        playerList = (GameStarter.setPlayersName(scanner, numberOfPlayer));


        System.out.println("Liczba graczy: " + numberOfPlayer);
        playerList.forEach(System.out::println);

        scanner.close();
    }
}
