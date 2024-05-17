package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

@Disabled
public class PlayerControllerSeleniumTest {

    private WebDriver driver;

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.edgedriver().setup();
    }

    @BeforeEach
    public void setupTest() {
        driver = new EdgeDriver();
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testNumberOfPlayersDisplayed() {
        driver.get("http://localhost:8080/players");
        List<WebElement> players = driver.findElements(By.className("player-name"));
        Assertions.assertEquals(2, players.size(), "Should display exactly two players");
    }

    @Test
    public void testFirstPlayerNameDisplayed() {
        driver.get("http://localhost:8080/players");
        WebElement firstPlayerName = driver.findElement(By.className("player-name"));
        Assertions.assertTrue(firstPlayerName.isDisplayed(), "First player name should be displayed");

        String playerName = firstPlayerName.getText();
        Assertions.assertEquals("Benim", playerName);
    }

    @Test
    public void testPageTitle() {
        driver.get("http://localhost:8080/players");
        Assertions.assertEquals("Players List", driver.getTitle());
    }

    @Test
    public void testLoginButtonText() {
        driver.get("http://localhost:8080/players");
        WebElement loginButton = driver.findElement(By.tagName("button"));
        Assertions.assertEquals("Logga in", loginButton.getText());
    }
}
