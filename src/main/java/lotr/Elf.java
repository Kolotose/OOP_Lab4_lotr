package lotr;

public class Elf extends Character{
    public Elf() {
        setHp(10);
        setPower(10);
        setType(CharacterType.ELF);
    }

    private void decreasePower(Character opponent) {
        opponent.setPower(opponent.getPower() - 1);
    }

    @Override
    public void kick(Character opponent) {
        if (opponent.getPower() < getPower()) {
            opponent.setHp(0);
            System.out.println("«Perish putridity!»");
            System.out.println(">>> Elf wiped out " + opponent.getName() + " <<<");
        }
        else {
            decreasePower(opponent);
            System.out.println("«For the moon!»");
            System.out.println(">>> Elf decreased " + opponent.getName() + "'s power by 1 <<<");
        }
    }
}
