public class Horse extends Animal{
    public Horse() {
        super.name = "Anonymous Horse";
    }

    public Horse(long weight, String name) {
        super.weight = weight;
        super.name = name;
    }

    public Horse(int weight, String name) {
        super.weight = weight;
        super.name = name;
    }
}
