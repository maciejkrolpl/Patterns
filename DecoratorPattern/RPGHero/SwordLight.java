package DecoratorPattern.RPGHero;

public class SwordLight extends AbstractItem {

    private static final int ATTACK = 20;
    AbstractHero hero;

    public SwordLight(AbstractHero hero) {
        this.hero = hero;
    }

    @Override
    public int getDefence() {
        return hero.getDefence();
    }

    @Override
    public int getAttack() {
        return hero.getAttack()+ ATTACK;
    }

    @Override
    public int getCapacity() {
        return hero.getCapacity();
    }

    @Override
    public String getName() {
        return hero.getName() + "has light sword (+" + ATTACK + " to attack) ";
    }
}
