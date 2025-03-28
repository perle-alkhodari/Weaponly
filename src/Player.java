public class Player {
    // Private Member Variables
    private int health;
    private int defence;
    private int totalDefence;
    private Shield shield;
    private Weapon weapon;

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
    public int getDefence() { return defence; }
    public Shield getShield() {return shield;}
    public Weapon getWeapon() {return weapon;}

    // Setters
    public void setHealth(int health) {this.health = health;}
    public void setShield(int defence) {this.defence = defence;}
    public void setShield(Shield shield) {this.shield = shield;}
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}
}
