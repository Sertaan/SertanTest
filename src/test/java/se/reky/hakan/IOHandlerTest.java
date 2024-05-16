package se.reky.hakan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IOHandlerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void promptForNewGameWhenYes() {
        String expectedValue = "Do you want to start a new game? (yes/no)";
        assertTrue(initIOHandler("yes").promptForNewGame());
        assertEquals(expectedValue, outputStreamCaptor.toString().trim());
    }

    @Test
    void promptForNewGameWhenNo() {
        String expectedValue = "Do you want to start a new game? (yes/no)";
        assertFalse(initIOHandler("no").promptForNewGame());
        assertEquals(expectedValue, outputStreamCaptor.toString().trim());
    }

    @Test
    void promptForContinueWhenYes() {
        String expectedValue = "Do you want to play again? (yes/no)";
        assertTrue(initIOHandler("yes").promptForContinue());
        assertEquals(expectedValue, outputStreamCaptor.toString().trim());
    }

    @Test
    void promptForContinueWhenNo() {
        String expectedValue = "Do you want to play again? (yes/no)";
        assertFalse(initIOHandler("no").promptForContinue());
        assertEquals(expectedValue, outputStreamCaptor.toString().trim());
    }

    @Test
    void displayEndGameMessage() {
        String expectedValue = "Thank you for playing!";
        initIOHandler("").displayEndGameMessage();
        assertEquals(expectedValue, outputStreamCaptor.toString().trim());
    }

    @Test
    void output() {
        String expectedValue = "Test output";
        initIOHandler("").output(expectedValue);
        assertEquals(expectedValue, outputStreamCaptor.toString().trim());
    }


    private IOHandler initIOHandler(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }

    @Test
    void testHasNextInt() {
        IOHandler ioHandler = initIOHandler("123");

        assertTrue(ioHandler.hasNextInt());

        ioHandler = initIOHandler("Hello");

        assertFalse(ioHandler.hasNextInt());
    }


}
/*
selenium
 */
