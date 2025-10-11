package Praktikum;

public class Goblin extends Enemy {
    public Goblin() {
        super("Goblin", 50, 10);
    }

    @Override
    public void attack(Player player) {
        double criticalChance = Math.random();
        if (criticalChance <= 0.05) {
            int criticalDamage = attackPower * 2;
            System.out.println(name + " melakukan serangan kritikal pada " + player.getName() + " sebesar " + criticalDamage + " damage!");
            player.takeDamage(criticalDamage);
        } else {
            super.attack(player);
        }
    }
}
