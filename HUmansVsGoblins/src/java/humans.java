package java;

public class humans {
    private int health = 100, attack = 15, defense= 10;
    
    public humans (){}

    public humans (int h, int a, int d) {
        health = h;
        attack = a;
        defense = d;
    }
    //Getters and Setters for Humans Attributes/Fields
    public int getHealth(){return health;}
    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {return attack;}
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {return defense;}
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String main(String[] args){

    }
}
