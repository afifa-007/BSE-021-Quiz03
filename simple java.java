import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Print a greeting message
        System.out.println("Hello, World!");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Nice to meet you, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
