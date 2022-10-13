package lotr;

import java.util.Random;

public class Noble extends Character {
    int[] bounds = new int[2];
    Random random = new Random();

    public Noble(int origin, int bound, CharacterType type) {
        setHp(random.nextInt(origin, bound + 1));
        setPower(random.nextInt(origin, bound + 1));
        setType(type);
    }

    public void kick(Character opponent) {
        int damage = random.nextInt(getPower() + 1);
        opponent.setHp(opponent.getHp() - damage);
        System.out.println(this.getName() + " dealt " + damage + " damage to " + opponent.getName());
    }
}
