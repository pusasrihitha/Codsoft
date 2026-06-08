import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1;

        System.out.print("Guess a number between 1 and 100: ");
        int guess = sc.nextInt();

        if (guess == number) {
            System.out.println("Correct!");
        } else {
            System.out.println("The correct number was " + number);
        }

        sc.close();
    }
}
