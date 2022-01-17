package java;

public class humans {
    private int health = 100, attack = 15, defense= 10;
    public String playLevel;

    //Default constructor
    public humans () {}
    public humans (int h, int a, int d) {
        health = h;
        attack = a;
        defense = d;
    }

    //Getters and Setters for Humans Attributes/Fields
    public int getHealth(){return health;}
    public void setHealth(int health) {this.health = health;}

    public int getAttack() {return attack;}
    public void setAttack(int attack) {this.attack = attack;}

    public int getDefense() {return defense;}
    public void setDefense(int defense) {this.defense = defense;}

    public static humans level(String level) {
        new humans();

        return switch (level) {
            case "easy" -> new humans(100, 15, 10);
            case "medium" -> new humans(80, 10, 5);
            case "hard" -> new humans(60, 5, 0);
            default -> new humans();
        };
    }

    //Override toString Method to display instance of Object
    @Override
    public String toString() {
        return "Humans {" +
                "\n health = " + health +
                "\n attack = " + attack +
                "\n defense = " + defense +
                "\n }";
    }
}
