public class WoodenStick extends Weapon{
    // Member Variables

    // Constructors
    public WoodenStick() {
        super("Wood", 0.4,
                (int)(Math.random() * 16) + 10,         // Damage range: 10 - 25
                (25 * 50),                                      // Durability: MaxDamage * 50
                3);
    }
    public WoodenStick(int damage, int durability, double hitsPerSecond) {
        super("Wood", 0.4,
                damage < 10 ? 10 : ((damage > 25) ? 25 : damage),
                durability > 25 * 50 ? 25 * 50 : durability,
                hitsPerSecond);
    }

    // Methods
    // Override Methods
    // Getters
    // Setters
}
