

public class loops {

    public static void main(String[] args) {

        // 1. Print 1 to 10
        System.out.println("1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // 2. Print 10 to 1
        System.out.println("\n\n10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // 3. Even numbers 2 to 20
        System.out.println("\n\nEven numbers (2 to 20):");
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // 4. Odd numbers 1 to 15
        System.out.println("\n\nOdd numbers (1 to 15):");
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // 5. Numbers from 5 to 50 (step 5)
        System.out.println("\n\n5 to 50 (step 5):");
        for (int i = 5; i <= 50; i += 5) {
            System.out.print(i + " ");
        }
    }
}