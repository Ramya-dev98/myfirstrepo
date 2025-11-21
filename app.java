import java.util.Scanner;

public class SampleProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt for name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();

            // Validate name
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
                return;
            }

            // Prompt for age
            System.out.print("Enter your age: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Age must be a number.");
                return;
            }
            int age = scanner.nextInt();

            // Validate age
            if (age < 0 || age > 150) {
                System.out.println("Invalid age. Please enter a realistic value.");
                return;
            }

            // Output greeting
            System.out.println("Hello, " + name + "! You are " + age + " years old.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// dev-2 pushed the code

public class AddTwoIntegers {
   public static void main(String[] args) {
       int first = 10;
       int second = 20;
       int sum = first + second;
       System.out.println("The sum is: " + sum);
}}

new code by dev-1 without pulling dev-2 code
