package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    @Test
    public void testAttack() {
        // Skapa två instanser av implementationer av Actor med specifika värden
        Actor attacker = new Player("Attacker", 100, 20); // Exempelvärden
        Actor target = new Player("Target", 100, 10); // Exempelvärden

        // Spara den ursprungliga HP:n för den attackerade
        int originalTargetHP = target.getHp();

        // Utför attack
        attacker.attack(target);

        // Verifiera att den attackerades HP minskar som förväntat (skadan från attacken)
        Assertions.assertEquals(originalTargetHP - attacker.getDamage(), target.getHp(),
                "Target's HP should decrease by attacker's damage");
    }
}
