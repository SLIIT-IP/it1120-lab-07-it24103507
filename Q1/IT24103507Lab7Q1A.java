import java.util.Scanner;

public class IT24103507Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter marks for Subject 4: ");
        int subject4 = scanner.nextInt();

       
        int total = subject1 + subject2 + subject3 + subject4;
        double average = total / 4.0;

       
        System.out.println("Average Marks: " + average);

			if (average >= 75 && average <= 100) {
				System.out.println("Grade: Distinction");
			} else if (average >= 50 && average <= 74) {
				System.out.println("Grade: Credit");
			} else if (average >= 0 && average <= 49) {
				System.out.println("Grade: Fail");
			} else {
				System.out.println("Invalid marks entered!");
			}

        scanner.close();
    }
}
