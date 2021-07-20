package cloud.cholewa.game;

import cloud.cholewa.config.ErrorDict;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void shouldThrow_IllegalArgumentException_WhenNameIsNull() {
        //given

        //when

        //then
        try {
            new Player(null);
            fail("Expected Illegal Argument Exception, but was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(ErrorDict.PLAYER_CREATE_ERROR_CANT_BE_NULL, e.getMessage());
        }
    }

    @Test
    public void shouldThrow_IllegalArgumentException_WhenNameEmptyString() {
        //given

        //when
        //then
        try {
            new Player("");
            fail("Expected Illegal Argument Exception, but was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(ErrorDict.PLAYER_CREATE_ERROR_CANT_BE_EMPTY_STRING, e.getMessage());
        }
    }

    @Test
    public void shouldReturnValidPlayerName() {
        //given
        String name = "Tomek";
        Player player = new Player(name);

        //when
        String expectedPlayerName = player.toString();

        //then
        assertEquals(expectedPlayerName, name);
    }
}
