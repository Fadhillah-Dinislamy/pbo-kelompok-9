package Praktikum;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Fadhil Bayangan", 100, 20);
        Enemy goblin = new Goblin();

        System.out.println(player.getName() + " bertemu dengan " + goblin.getName() + " di hutan hitam!");
        System.out.println("== Mulai ==");
        player.attack(goblin);
        goblin.attack(player);
        System.out.println();

        System.out.println("=== Hasil Pertarungan ===");
        System.out.println("Sisa HP " + player.getName() + ": " + player.getHealth());
        System.out.println("Sisa HP " + goblin.getName() + ": " + goblin.getHealth());

        if (player.getHealth() <= 0) {
            System.out.println("\n" + player.getName() + " telah dikalahkan oleh " + goblin.getName() + "!");
        } else if (goblin.getHealth() <= 0) {
            System.out.println("\n" + goblin.getName() + " dikalahkan!" + player.getName() + " Menang!");
        } else {
            System.out.println("\nTidak ada pemenang");
        }
    }
}
