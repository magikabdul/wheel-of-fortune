package cloud.cholewa.game.components;

import java.util.List;
import java.util.Random;

public class PasswordManager {
    private final List<String> passwords;

    public PasswordManager() {
        passwords = List.of(
                "Apetyt rośnie w miarę jedzenia",
                "Co dwie głowy, to nie jedna",
                "Ćwiczenie czyni mistrza",
                "Darowanemu koniowi w zęby się nie zagląda",
                "Diabeł tkwi w szczegółach",
                "Elektryka prąd nie tyka"
        );
    }

    public String getRandomPassword() {
        Random r = new Random();

        return passwords.get(r.nextInt(passwords.size()));
    }
}
