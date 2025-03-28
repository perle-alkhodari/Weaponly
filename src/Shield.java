public class Shield {
    // Private Member Variables
    String material;
    double weight;
    int durability;
    int defence;

    // Constructors
    public Shield(String material, double weight, int durability, int defence) {
        this.material = material;
        this.weight = weight;
        this.durability = durability;
        this.defence = defence;
    }
    public Shield() {
        this("Unknown", 0, 0, 0);
    }

    // Getters
    public String getMaterial() {return material;}
    public double getWeight() {return weight;}
    public int getDurability() {return durability;}
    public int getDefence() {return defence;}

    // Setters
    public void setMaterial(String material) {this.material = material;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setDurability(int durability) {this.durability = durability;}
    public void setDefence(int defence) {this.defence = defence;}

}
