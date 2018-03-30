package DecoratorPattern.RPGHero;

public class Demo {

    public static void main(String[] args) {

        Dwarf dwarf = new Dwarf();
        System.out.println(dwarf.getName());
        dwarf.printSkills();
        System.out.println();

        ShieldMedium shieldMedium = new ShieldMedium(dwarf);
        System.out.println(shieldMedium.getName());
        shieldMedium.printSkills();
        System.out.println();
        SwordLight sword = new SwordLight(shieldMedium);

        System.out.println(sword.getName());
        sword.printSkills();
        System.out.println();

        BackpackLight backpackLight = new BackpackLight(sword);
        System.out.println(backpackLight.getName());
        backpackLight.printSkills();

        System.out.println();
        
        Elf elf = new Elf();
        System.out.println(elf.getName());
        elf.printSkills();
        System.out.println();

        ShieldLight shieldLight = new ShieldLight(elf);
        System.out.println(shieldLight.getName());
        shieldLight.printSkills();
        System.out.println();

        SwordMedium swordMedium = new SwordMedium(shieldLight);
        System.out.println(swordMedium.getName());
        swordMedium.printSkills();
        System.out.println();

        BackpackMedium backpackMedium = new BackpackMedium(swordMedium);
        System.out.println(backpackMedium.getName());
        backpackMedium.printSkills();
        

    }

}
