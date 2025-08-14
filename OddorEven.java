import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer value: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("It is an even number.");
            } else {
                System.out.println("It is an odd number.");
            }
        }
    }
}
