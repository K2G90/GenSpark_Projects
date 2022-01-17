package java;

public class goblins {
    int health = 40;
    int attack = 20;
    
    //Default constructor
    public goblins() {
    }

    public goblins(int attack, int health) {
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

    public int getAttack() {return attack;}
    public void setAttack(int attack) {this.attack = attack;}

    //method for setting Goblin Obj depending on Level selected
    public static goblins level(String level) {
        new goblins();

        return switch (level) {
            case "easy" -> new goblins(60, 5);
            case "medium" -> new goblins(80, 10);
            case "hard" -> new goblins(100, 15);
            default -> new goblins();
        };
    }

    //Override toString Method to display instance of Object
    @Override
    public String toString() {
        return "Goblins {" +
                "\n health = " + health +
                "\n attack = " + attack +
                "\n }";
    }
}