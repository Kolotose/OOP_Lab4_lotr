import lotr.Character;
import lotr.Knight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new Knight();
    }

    @Test
    public void testIsClass() {
        character = new Knight();
        assertTrue(character instanceof Character);
    }

    @Test
    public void testHp() {
        character = new Knight();
        assertTrue(character.getHp() >= 2 && character.getHp() <= 12);
    }

    @Test
    public void testPower() {
        character = new Knight();
        assertTrue(character.getPower() >= 2 && character.getPower() <= 12);
    }
}