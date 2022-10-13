package mechanics;

import lotr.Character;
import lotr.CharacterType;

public class GameManager {
    public static void fight(Character char1, Character char2) {
        int counter  = 1;
        // Prints the beginning of battle
        System.out.println("The battle begins");
        System.out.println("Character 1: " + char1);
        System.out.println("Character 2: " + char2);


        // Main cycle
        do {
            System.out.println();
            System.out.println("------- Move " + counter + " -------");

            char1.kick(char2);
            char2.kick(char1);
            System.out.println("Character 1 status: " + char1);
            System.out.println("Character 2 status: " + char2);

            if (char1.getType().equals(CharacterType.HOBBIT) &&
                char2.getType().equals(CharacterType.HOBBIT)) {
                System.out.println();
                System.out.println("This loud and clumsy battle was infinite");
                break;
            }

            if (char1.getType().equals(CharacterType.ELF) &&
                char2.getType().equals(CharacterType.ELF)) {
                System.out.println();
                System.out.println("The dance under the moon was infinite");
                break;
            }
        } while (char1.isAlive() && char2.isAlive());
        System.out.println();

        // Prints the end of battle
        if (char1.isAlive() && char2.isAlive())
            System.out.println("Two " + char1.getName() + "s died from exhaustion.");
        else if (char1.isAlive())
            System.out.println("Character 1 has won the battle.");
        else if (char2.isAlive())
            System.out.println("Character 2 has won the battle.");
        else
            System.out.println("Everyone is dead");
    }
}
