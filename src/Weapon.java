public class Weapon {

    // Protected Member Variables
    protected String material;      // The material of the weapon (ex. iron, gold, etc.)
    protected double weight;        // The weight of the weapon in kgs
    protected int damage;           // How much damage a weapon can inflict on anything
    protected int durability;       // How much damage a weapon can take before getting destroyed

    // Static variables
    public static String is = "Weapon";

    // Constructors
    public Weapon(String material, double weight, int damage, int durability) {
        this.material = material;
        this.weight = weight;
        this.damage = damage;
        this.durability = durability;
    }
    public Weapon() {
        this("Unknown", 0, 0, 0);
    }

    // Methods
    public void attack(Weapon weapon) {
        this.durability -= weapon.damage;
        weapon.durability -= this.damage;
    }

    // Unique Methods
    @Override
    public String toString() {
        return "Weapon{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", damage=" + damage +
                ", durability=" + durability +
                '}';
    }

    // Getters
    public String getMaterial() { return material; }
    public double getWeight() { return weight; }
    public int getDamage() { return damage; }
    public int getDurability() { return durability; }

    // Setters
    public void setMaterial(String material) { this.material = material; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setDamage(int damage) { this.damage = damage; }
    public void setDurability(int durability) { this.durability = durability; }
}
