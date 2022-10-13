package lotr;

public abstract class Character {
    private int hp, power;
    private CharacterType type;

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

    public void kick(Character opponent) {
    }

    public boolean isAlive() {
        return hp > 0;
    }
}

