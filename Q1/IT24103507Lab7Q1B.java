import java.util.Scanner;

public class IT24103507Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter marks for 4 subjects " + i + ": ");

            int subject1 = scanner.nextInt();
            int subject2 = scanner.nextInt();
            int subject3 = scanner.nextInt();
            int subject4 = scanner.nextInt();

            int total = subject1 + subject2 + subject3 + subject4;
            double average = total / 4.0;

            System.out.println("Average Marks for Student " + i + ": " + average);

            if (average >= 75 && average <= 100) {
                System.out.println("Grade: Distinction");
            } else if (average >= 50 && average <= 74) {
                System.out.println("Grade: Credit");
            } else if (average >= 0 && average <= 49) {
                System.out.println("Grade: Fail");
            } else {
                System.out.println("Invalid marks!");
            }

            System.out.println();  // For a blank line between students' results
        }

        scanner.close();
    }
}
