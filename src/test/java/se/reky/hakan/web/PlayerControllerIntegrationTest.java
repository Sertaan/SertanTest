package se.reky.hakan.web;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Disabled("Disabled on GitHub")
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PlayerControllerIntegrationTest {




    @GetMapping("/players")
    public String Players(@RequestParam(name = "name") String name) {
        return "Your name, " + name + "!";

    }

}

/*
du ska skapa en testfil för playercontroller
        så kalla den PlayerControllerTest.java
        sen när due inne på klassen som heter : ProjektUppgiftApplication, tryck på kör så den startas
        sen gå in på webbläsaren o skriv http://localhost:8080/
        för o se spelarna du skapat med spelet gå till http://localhost:8080/players
        sen ba copy pasta selenium uppgifterna i chat o due klar
 */