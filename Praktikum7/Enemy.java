package Praktikum;

public class Enemy {
    protected String name;
    protected int health;
    protected int attackPower;

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public int getHealth() {
        return health;}

    public void setHealth(int health) {
        this.health = health;}

    public int getAttackPower() {
        return attackPower;}

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;}

    public void attack(Player player) {
        System.out.println(name + " menyerang " + player.getName() + " sebesar " + attackPower + " damage!");
        player.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " terkena serangan sebesar " + damage + " damage! Health tersisa: " + health);
        if (health <= 0) {
            System.out.println(name + " telah dikalahkan");
        }
    }
}
