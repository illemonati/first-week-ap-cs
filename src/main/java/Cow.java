public class Cow extends Animal{

    //fields
//    private long weight = 1800;
//    private String name = "Anonymous Cow";

    //constructors
    public Cow() {
        super.name = "Anonymous Cow";
    }

    public Cow(long weight, String name) {
        super.weight = weight;
        super.name = name;
    }

    public Cow(int weight, String name) {
        super.weight = weight;
        super.name = name;
    }

    //getters
//    public long getWeight() {
//        return weight;
//    }

//    public String getName() {
//        return name;
//    }

//    public int compareTo(Cow c){
//        if(this.weight == c.weight)
//            return 0;
//        else if(this.weight > c.weight)
//            return 1;
//        else
//            return -1;
//    }
}
