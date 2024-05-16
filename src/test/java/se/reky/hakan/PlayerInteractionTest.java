package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class PlayerInteractionTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
        player.setHp(10);
    }

    private PlayerInteraction createPlayerInteraction(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        return new SimplePlayerInteraction(ioHandler);
    }


    @Test
    public void testPlayerSetup() {
        String expectedName = "Peter";
        PlayerInteraction playerInteraction = createPlayerInteraction(expectedName);
        playerInteraction.setupPlayer(player);
        Assertions.assertEquals(expectedName, player.getName());
    }
}