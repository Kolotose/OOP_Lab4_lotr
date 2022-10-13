import lotr.Character;
import lotr.King;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KingTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new King();
    }

    @Test
    public void testIsClass() {
        character = new King();
        assertTrue(character instanceof Character);
    }

    @Test
    public void testHp() {
        character = new King();
        assertTrue(character.getHp() >= 5 && character.getHp() <= 15);
    }

    @Test
    public void testPower() {
        character = new King();
        assertTrue(character.getPower() >= 5 && character.getPower() <= 15);
    }
}