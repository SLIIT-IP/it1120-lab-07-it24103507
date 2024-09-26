public class IT24103507Lab7Q2A {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for columns (printing $ symbols)
            for (int j = 1; j <= 5; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
