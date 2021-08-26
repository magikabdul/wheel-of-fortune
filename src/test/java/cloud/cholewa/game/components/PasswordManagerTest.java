package cloud.cholewa.game.components;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordManagerTest {

    @Test
    public void shouldReturnInitialNumberOfPasswords() {
        //given
        PasswordManager pm = new PasswordManager();

        //when
        //then
        assertEquals(6, pm.getNumberOfPasswords());
    }

    @Test
    public void shouldCreateListOfNewPasswords() {
        //given
        PasswordManager pm = new PasswordManager();

        String pass1 = "Nosił wilk razy kilka, ponieśli i wilka";

        //when
        int oldPasswordsNumber = pm.getNumberOfPasswords();

        pm.setPasswords(List.of(pass1));
        int newPasswordsNumber = pm.getNumberOfPasswords();

        String selectedPassword = pm.getRandomPassword();

        //then
        assertEquals(6, oldPasswordsNumber);
        assertEquals(1, newPasswordsNumber);
        assertEquals(pass1, selectedPassword);
    }

    @Test
    public void shouldReturnUniquePasswords() {
        //given
        PasswordManager pm = new PasswordManager();

        String p1 = "Apetyt rośnie w miarę jedzenia";
        String p2 = "Co dwie głowy, to nie jedna";
        String p3 = "Ćwiczenie czyni mistrza";
        String p4 = "Darowanemu koniowi w zęby się nie zagląda";
        String p5 = "Diabeł tkwi w szczegółach";
        String p6 = "Elektryka prąd nie tyka";


        List<String> list = List.of(p1, p2, p3, p4, p5, p6);

        //when
        pm.setPasswords(list);
        int numberOfPasswords = pm.getNumberOfPasswords();

        List<String> randomlySelectedPasswords = new ArrayList<>();

        for (int i = 0; i < numberOfPasswords; i++) {
            randomlySelectedPasswords.add(pm.getRandomPassword());
        }

        long quantityOfPass1 = randomlySelectedPasswords.stream().filter(s -> s.equals(p1)).count();
        long quantityOfPass2 = randomlySelectedPasswords.stream().filter(s -> s.equals(p2)).count();
        long quantityOfPass3 = randomlySelectedPasswords.stream().filter(s -> s.equals(p3)).count();
        long quantityOfPass4 = randomlySelectedPasswords.stream().filter(s -> s.equals(p4)).count();
        long quantityOfPass5 = randomlySelectedPasswords.stream().filter(s -> s.equals(p5)).count();
        long quantityOfPass6 = randomlySelectedPasswords.stream().filter(s -> s.equals(p6)).count();

        //then
        assertEquals(1, quantityOfPass1);
        assertEquals(1, quantityOfPass2);
        assertEquals(1, quantityOfPass3);
        assertEquals(1, quantityOfPass4);
        assertEquals(1, quantityOfPass5);
        assertEquals(1, quantityOfPass6);
    }
}
