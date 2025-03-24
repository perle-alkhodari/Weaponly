public class IronSword extends Weapon{
    // Member Variables

    // Constructors
    public IronSword() {
        super("Iron",
                1.3,
                (int)(Math.random() * 26) + 30,     // Damage range: 30 - 55
                55 * 50,                                    // Durability: MaxDamage * 50
                2);
    }
    public IronSword(int damage, int durability, double hitsPerSecond) {
        super("Iron", 1.3,
                damage < 30 ? 30 : ((damage > 55) ? 55 : damage),
                durability > 2750 ? 2750 : durability,
                hitsPerSecond);
    }

    // Methods
    // Override Methods
    // Getters
    // Setters
}
