package se.reky.hakan.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;

public class GameUtilTest {

    @Test
    public void testToLowerCaseButFirstLetterCapitalizedWithNullInput() {
        // Skapa en instans av GameUtil
        GameUtil gameUtil = new GameUtil();

        // Testa att kasta GameException när input är null
        Assertions.assertThrows(GameException.class, () -> {
            gameUtil.toLowerCaseButFirstLetterCapitalized(null);
        });
    }
}
