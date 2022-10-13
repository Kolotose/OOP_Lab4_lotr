package lotr;

import java.util.Random;

public enum CharacterType {
    ELF, HOBBIT, KING, KNIGHT;
    static final Random random = new Random();

    public static CharacterType randomCharacter() {
        CharacterType[] characterTypes = CharacterType.values();
        int ind = random.nextInt(characterTypes.length);
        return characterTypes[ind];
    }
}
