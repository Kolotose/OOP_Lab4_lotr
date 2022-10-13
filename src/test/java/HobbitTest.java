import lotr.Hobbit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HobbitTest {
    private Hobbit character;

    @BeforeEach
    public void init() {
        character = new Hobbit();
    }

    @Test
    public void testToString() {
        character = new Hobbit();
        assertEquals("Hobbit{hp=3, power=0}", character.toString());
    }

    @Test
    public void testIsClass() {
        character = new Hobbit();
        assertTrue(character instanceof lotr.Character);
    }

    @Test
    public void testSetHp() {
        character = new Hobbit();
        character.setHp(-100);
        assertEquals(0, character.getHp());
    }
}