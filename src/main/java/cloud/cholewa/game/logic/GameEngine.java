package cloud.cholewa.game.logic;

import cloud.cholewa.game.components.Player;

import java.util.List;
import java.util.Scanner;

import static cloud.cholewa.common.ConsoleControl.showConsoleMessage;
import static cloud.cholewa.game.messages.GameMessage.WELCOME_MESSAGE;

public class GameEngine {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        int numberOfPlayer;
        List<Player> playerList;

        showConsoleMessage("");
        showConsoleMessage(WELCOME_MESSAGE, 1);

        numberOfPlayer = GameStarter.setNumberOfPlayers(scanner);
        playerList = (GameStarter.setPlayersName(scanner, numberOfPlayer));

        //to remove in final version
        showConsoleMessage("", 1);
        System.out.println("Liczba graczy: " + numberOfPlayer);
        playerList.forEach(System.out::println);

        scanner.close();
    }
}
