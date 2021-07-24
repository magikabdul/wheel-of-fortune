package cloud.cholewa.game.logic;

import cloud.cholewa.game.components.Player;

import java.util.List;

import static cloud.cholewa.common.ConsoleControl.showConsoleMessage;
import static cloud.cholewa.game.messages.GameMessage.BEGIN_OF_ROUND;
import static cloud.cholewa.game.messages.GameMessage.PLAYER_TURN;

public class GameProcessor {

    public static void run(List<Player> players, int numberOfGameRounds) {
        for (int i = 0; i < numberOfGameRounds; i++) {
            showConsoleMessage("");
            showConsoleMessage(BEGIN_OF_ROUND + (i + 1));

            players.forEach(player -> showConsoleMessage(PLAYER_TURN + player));
        }
    }
}
