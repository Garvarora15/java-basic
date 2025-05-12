import java.util.*;
public class againloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            // Age check
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age > 18) {
                System.out.println("Adult");
            } else {
                System.out.println("Not Adult");
            }

            // Even/Odd check
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            checkEvenOdd(number);

            // Input validation loop
            while (true) {
                System.out.print("Would you like to run the program again? (Y/N): ");
                choice = sc.next().charAt(0);

                if (choice == 'Y' || choice == 'y' || choice == 'N' || choice == 'n') {
                    break; // valid input, exit inner loop
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            }

        } while (choice == 'Y' || choice == 'y');

        sc.close();
        System.out.println("Program exited.");
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
