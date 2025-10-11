package Praktikum;

public class Player {
    private String name;
    private int health;
    private int attackPower;

    Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public int getHealth() {
        return health;}

    public void setHealth(int health) {
        this.health = health;}

    public int getAttackPower() {
        return attackPower;}

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;}

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    void attack(Enemy enemy) {
        System.out.println(this.name + " menyerang " + enemy.getName() + " sebesar " + this.attackPower + " damage.");
        enemy.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " Terkena serangan sebesar  " + damage + " damage! Health tersisa: " + health);
        if (health <= 0) {
            System.out.println(name + " Telah dikalahkan");
        }
    }
}