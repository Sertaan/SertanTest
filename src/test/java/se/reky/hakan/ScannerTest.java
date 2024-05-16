package se.reky.hakan;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScannerTest {


    private Scanner scanner(String dataForScanner) {
        return new Scanner(dataForScanner);
    }


    @Test
    public void testScanner() {
        Scanner scannerInput = scanner ("Try me");
        assertEquals("Try me", scannerInput.nextLine());
    }

}
