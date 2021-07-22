package cloud.cholewa.game;

import cloud.cholewa.config.ErrorDict;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PlayerTest {

    @Test
    public void shouldThrow_IllegalArgumentException_WhenNameIsNull() {
        //given

        //when

        //then
        assertThatThrownBy(() -> new Player(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorDict.PLAYER_CREATE_ERROR);
    }

    @Test
    public void shouldThrow_IllegalArgumentException_WhenNameIsEmptyString() {
        //given

        //when
        //then
        assertThatThrownBy(() -> new Player(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorDict.PLAYER_CREATE_ERROR);
    }

    @Test
    public void shouldThrow_IllegalArgumentException_WhenNameIsEmptyStringButSpaces() {
        //given

        //when
        //then
        assertThatThrownBy(() -> new Player(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorDict.PLAYER_CREATE_ERROR);
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
