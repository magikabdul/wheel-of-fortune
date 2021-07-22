package cloud.cholewa.game.logic;

import cloud.cholewa.game.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameStarter {

    public static int setNumberOfPlayers(Scanner scanner) {
        int number;

        System.out.print("Podaj liczbę graczy (2-4): ");
        number = scanner.nextInt();

        if (number < 2 || number > 4) {
            System.out.println("Błędna ilość graczy !");
            System.exit(0);
        }

        return number;
    }

    public static List<Player> setPlayersName(Scanner scanner, int numberOfPlayers) {
        List<Player> playerList = new ArrayList<>();

        while (playerList.size() < numberOfPlayers) {
            try {
                System.out.print("Podaj imię gracza nr " + (playerList.size() + 1) + ": ");
                String name = scanner.nextLine();
                Player player = new Player(name);
                playerList.add(player);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\n");
            }
        }

        return playerList;
    }
}
