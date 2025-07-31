import java.util.Random;

class GameAthelete{
    String name;
    int energy;
    int skillPower;
    int maxEnergy;
    boolean isActive;

    static int totalAtheletes = 0;

    GameAthelete() {
        this.name = "Player";
        this.energy = 100;
        this.skillPower = 10;
        this.maxEnergy = 100;
        this.isActive = true;
        totalAtheletes++;
    }

    GameAthelete(String name, int energy, int skillPower) {
        this.name = name;
        this.energy = energy;
        this.skillPower = skillPower;
        this.maxEnergy = energy;
        this.isActive = true;
        totalAtheletes++;
    }

    void compete(GameAthelete opponent) {
        System.out.println("\n"+this.name + " is competing with " + opponent.name);
        if(this.energy < opponent.skillPower) {
            System.out.println(this.name + " does not have enough energy to compete");
            this.isActive = false;
            return;
        }
        opponent.energy -= this.skillPower;
    }

    void rest(int amount) {
        System.out.println("\n"+this.name + " is resting for " + amount + " minutes");
        if(this.energy + amount > this.maxEnergy) {
            this.energy = this.maxEnergy;
        }
        else {
            this.energy += amount;
        }
    }

    void train() {
        Random rand = new Random();
        skillPower += rand.nextInt(11); // Increase skill power by a random amount between 0 and 10
        System.out.println("\n"+this.name + " has trained and increased skill power to " + this.skillPower);
    }

    void displayStatus() {
        System.out.println("\n--- Athlete Status ---");
        System.out.println("Name: " + this.name);
        System.out.println("Energy: " + this.energy);
        System.out.println("Skill Power: " + this.skillPower);
        System.out.println("Max Energy: " + this.maxEnergy);
        System.out.println("Is Active: " + this.isActive);
    }

}

class GameAtheleteTest {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557\n");
        GameAthelete player = new GameAthelete();
        GameAthelete Naveen = new GameAthelete("Naveen", 100, 20);
        GameAthelete John = new GameAthelete("John", 80, 15);

        System.out.println("Total Athletes: " + GameAthelete.totalAtheletes);

        player.displayStatus();
        Naveen.displayStatus();
        John.displayStatus();

        Naveen.compete(John);
        Naveen.displayStatus();
        John.displayStatus();

        player.rest(30);
        player.displayStatus();

        player.train();
        player.displayStatus();
    }
}
