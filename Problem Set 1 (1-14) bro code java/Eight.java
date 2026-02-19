import java.util.Random;

public class Eight {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Welcome to Dice Rolling Game");

        int number = random.nextInt(1, 7);
        System.out.println("Dice Rolled:" + number);
    }
}
