package cloud.cholewa.game;

import cloud.cholewa.config.ErrorDict;

public class Player {
    private String name;

    private Player() {
    }

    public Player(String name) {
        if (name == null) {
            throw new IllegalArgumentException(ErrorDict.PLAYER_CREATE_ERROR_CANT_BE_NULL);
        }
        if (name.equals("")) {
            throw new IllegalArgumentException(ErrorDict.PLAYER_CREATE_ERROR_CANT_BE_EMPTY_STRING);
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
