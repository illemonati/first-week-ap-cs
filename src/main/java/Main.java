import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        BNThings();
        FastExptThings();
        CowThings();
        AnimalThings();
    }

    static void BNThings(){
        System.out.println("BN:");
        System.out.println("--------------------");
        Primes first50 = new Primes(50);
        BrilliantNumbers first29 = new BrilliantNumbers(20);
        System.out.println(first29.getBrilliant_numbers());
        System.out.println("--------------------\n");
    }

    static void FastExptThings() {
        System.out.println("Fast Expt:");
        long res = FastExpt.fastExpt(2,4);
        System.out.println(res);
        System.out.println("--------------------\n");

    }

    static void CowThings(){
        System.out.println("Cow:");
        System.out.println("--------------------");
        Cow[] cows = { new Cow(2000, "Hulk"),
                new Cow(),
                new Cow(1600, "Bessie"),
                new Cow(1700, "Moohead"),
                new Cow(),
                new Cow(1900, "Big Time Jones") };

        printArray(cows);
        Arrays.sort(cows);
        printArray(cows);
        System.out.println("--------------------\n");
    }

    static void AnimalThings(){
        System.out.println("Animal:");
        System.out.println("--------------------");
        Animal[] animals = { new Horse(2000, "Hulk"),
                new Wombat(),
                new Wombat(1600, "Bessie"),
                new Cow(1700, "Moohead"),
                new Wombat(),
                new Wildebeest(1900, "Big Time Jones") };


        printArray(animals);
        for (Animal a : animals) {
            a.eat(200);
        }
        Arrays.sort(animals);
        printArray(animals);
        System.out.println("--------------------\n");
    }

    static void printArray(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.print(String.format("%s, ", animal));
        }
        System.out.println();
    }
}



