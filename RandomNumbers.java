import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random num = new Random();
        int number = num.nextInt(9);
        System.out.println("Random Number IS : "+number);
//        System.out.println("Random Number IS : "+Math.random());
        // random strings Print
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Sheep");
        animals.add("Pig");
        animals.add("Rabbit");
        animals.add("Bird");
        animals.add("Squid");
        animals.add("Human");
        System.out.println(animals.get(number));
    }
}
