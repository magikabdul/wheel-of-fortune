package cloud.cholewa.game;

import cloud.cholewa.config.ErrorDict;

public class Player {
    private String name;

    private Player() {
    }

    public Player(String name) {
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException(ErrorDict.PLAYER_CREATE_ERROR);
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
