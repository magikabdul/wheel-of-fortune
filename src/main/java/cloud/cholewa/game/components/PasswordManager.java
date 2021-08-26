package cloud.cholewa.game.components;

import cloud.cholewa.config.ErrorDict;

import java.util.*;

public class PasswordManager {
    private final List<String> passwords = new ArrayList<>();

    public PasswordManager() {
        passwords.add("Apetyt rośnie w miarę jedzenia");
        passwords.add("Co dwie głowy, to nie jedna");
        passwords.add("Ćwiczenie czyni mistrza");
        passwords.add("Darowanemu koniowi w zęby się nie zagląda");
        passwords.add("Diabeł tkwi w szczegółach");
        passwords.add("Elektryka prąd nie tyka");
    }

    public String getRandomPassword() {
        Random r = new Random();
        int numberOfPasswords = passwords.size();

        if (passwords.isEmpty()) {
            throw new IllegalStateException(ErrorDict.NO_UNIQUE_PASSWORD);
        }

        int random = r.nextInt(numberOfPasswords);
        String pass = passwords.get(random);
        passwords.remove(pass);

        return pass;
    }

    public void setPasswords(List<String> listOfPasswords) {
        passwords.clear();
        passwords.addAll(listOfPasswords);
    }

    public int getNumberOfPasswords() {
        return passwords.size();
    }
}
