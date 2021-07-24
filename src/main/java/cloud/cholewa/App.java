package cloud.cholewa;

import cloud.cholewa.config.ErrorDict;
import cloud.cholewa.exceptions.GameException;
import cloud.cholewa.game.logic.GameEngine;

import java.util.InputMismatchException;

import static cloud.cholewa.common.ConsoleControl.showConsoleMessage;
import static cloud.cholewa.game.messages.GameMessage.GAME_END;

public class App {
    public static void main(String[] args) {
        try {
            GameEngine.run();
        } catch (GameException | IllegalArgumentException | InputMismatchException e) {
            showConsoleMessage(e.getMessage());
        } catch (Exception e) {
            showConsoleMessage(ErrorDict.UNKNOWN_EXCEPTION);
            showConsoleMessage(e.getMessage());
        } finally {
            showConsoleMessage("");
            showConsoleMessage(GAME_END);
        }
    }
}
