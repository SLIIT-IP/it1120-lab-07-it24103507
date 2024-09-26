import java.util.Scanner;

public class IT24103507Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discountRate = 0.05;
        int numberOfCustomers = 5;

        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.println("Customer " + i + ":");
            
            System.out.print("Enter the total bill amount: ");
            double totalBill = scanner.nextDouble();
            
            System.out.print("Enter the mode of payment (C for Cash, O for Other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C') {
                
                double discount = totalBill * discountRate;
                double finalAmount = totalBill - discount;
                System.out.printf("Discount: %.2f\n", discount);
                System.out.printf("Amount to be paid after discount: %.2f\n", finalAmount);
            } else if (paymentMode == 'O') {
                
                System.out.printf("No discount applied. Amount to be paid: %.2f\n", totalBill);
            } else {
                
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); 
        }

        scanner.close();
    }
}