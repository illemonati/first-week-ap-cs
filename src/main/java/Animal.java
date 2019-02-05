public class Animal implements Comparable<Animal> {
    //fields
    protected long weight = 1800;
    protected String name = "Anonymous Animal";

    //constructors
    public Animal() {}

    public Animal(long weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    //getters
    public long getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    //other things
    public void eat(long amount) {
        this.weight += amount;
    }

    public int compareTo(Animal a){
        if(this.weight == a.getWeight())
            return 0;
        else if(this.weight > a.getWeight())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return String.format("%s:%d", this.getName(), this.getWeight());
    }
}
