package DecoratorPattern.RPGHero;

public class SwordMedium extends AbstractItem {

    private static final int ATTACK = 50;
    AbstractHero hero;

    public SwordMedium(AbstractHero hero) {
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
        return hero.getName() + "has medium sword (+" + ATTACK + " to attack) ";
    }
}
