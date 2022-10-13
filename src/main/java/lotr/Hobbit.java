package lotr;


public class Hobbit extends Character{
    public Hobbit() {
        setHp(3);
        setPower(0);
        setType(CharacterType.HOBBIT);
    }

    @Override
    public void kick(Character opponent) {
        toCry();
    }

    private void toCry() {
        System.out.println("I will die with honor!");
        System.out.println(">>> Hobbit missed a hit <<<");
    }
}
