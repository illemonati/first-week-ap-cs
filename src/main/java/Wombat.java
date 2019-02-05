public class Wombat extends Animal {
    public Wombat() {
        super.name = "Anonymous Wombat";
    }

    public Wombat(long weight, String name) {
        super.weight = weight;
        super.name = name;
    }

    public Wombat(int weight, String name) {
        super.weight = weight;
        super.name = name;
    }

    //other things
    public void eat(long amount) {
        System.out.println("Wombats don't gain weight when they eat!");
    }

}
