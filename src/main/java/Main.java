/*
The main class
Contains the game flow and its showcase
 */

import lotr.Character;
import mechanics.CharacterFactory;
import mechanics.GameManager;

public class Main {
    public static void main(String[] args) {
        Character char1 = CharacterFactory.createCharacter();
        Character char2 = CharacterFactory.createCharacter();
        GameManager.fight(char1, char2);
    }
}
