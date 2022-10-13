package mechanics;

import lotr.*;
import lotr.Character;

import java.util.Random;

public class CharacterFactory {
    Random random = new Random();
    public static Character createCharacter() {
        Character character;
        CharacterType type = CharacterType.randomCharacter();

        character = switch (type) {
            case ELF -> new Elf();
            case HOBBIT -> new Hobbit();
            case KING -> new King();
            case KNIGHT -> new Knight();
        };

        return character;
    }
}
