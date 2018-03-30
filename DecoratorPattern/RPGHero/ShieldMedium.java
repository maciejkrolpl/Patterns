package DecoratorPattern.RPGHero;

public class ShieldMedium extends AbstractItem {

    private static final int DEFENCE = 60;
    AbstractHero hero;

    public ShieldMedium(AbstractHero hero) {
        this.hero = hero;
    }

    @Override
    public int getDefence() {
        return hero.getDefence()+ DEFENCE;
    }

    @Override
    public int getAttack() {
        return hero.getAttack();
    }

    @Override
    public int getCapacity() {
        return hero.getCapacity();
    }

    @Override
    public String getName() {
        return hero.getName() + " wears medium shield (+" + DEFENCE + " to defence) ";
    }
}
