public class Player {
    // Private Member Variables
    int health;
    int defence;
    int totalDefence;
    Shield shield;
    Weapon weapon;

    // Constructors
    public Player(int health, int defence, Shield shield, Weapon weapon) {
        this.health = health;
        this.defence = defence;
        this.shield = shield;
        totalDefence = defence + shield.getDefence();
        this.weapon = weapon;
    }
    public Player() {
        this(0, 0, new Shield(), new Weapon());
    }

    // Getters
    public int getHealth() { return health; }
    public int getShield() { return defence; }

    // Setters
    public void setHealth() {this.health = health;}
    public void setShield(int defence) {this.defence = defence;}
}
