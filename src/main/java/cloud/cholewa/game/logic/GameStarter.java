package cloud.cholewa.game.logic;

import cloud.cholewa.exceptions.GameException;
import cloud.cholewa.game.components.Player;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static cloud.cholewa.common.ConsoleControl.showConsoleMessage;
import static cloud.cholewa.game.messages.GameMessage.*;

public class GameStarter {

    public static int setNumberOfPlayers(Scanner scanner) {
        boolean isNumberOfPlayersInvalid = true;
        int number = 0;

        while (isNumberOfPlayersInvalid) {
            showConsoleMessage(ENTER_NUMBER_OF_PLAYERS, 0);

            try {
                number = scanner.nextInt();

                if (number < 2 || number > 4) {
                    showConsoleMessage(INVALID_NUMBER_OF_PLAYERS);
                    throw new GameException(GAME_END);
                } else {
                    isNumberOfPlayersInvalid = false;
                }
            } catch (InputMismatchException e) {
                showConsoleMessage(ERROR_ENTERED_VALUE_IS_NOT_NUMBER);
                scanner.nextLine();
            }
        }

        scanner.nextLine();
        return number;
    }

    public static List<Player> setPlayersName(Scanner scanner, int numberOfPlayers) {
        List<Player> playerList = new ArrayList<>();

        while (playerList.size() < numberOfPlayers) {
            showConsoleMessage(ENTER_PLAYER_NAME + (playerList.size() + 1) + ": ", 0);
            String name = scanner.nextLine();

            try {
                Player player = new Player(name);
                playerList.add(player);
            } catch (IllegalArgumentException e) {
                showConsoleMessage(e.getMessage(), 1);
            }
        }

        return playerList;
    }
}
