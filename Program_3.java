import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int current = 1;
        while (current <= a) {
            System.out.print(current);
            current += 2; // Increment by 2 unconditionally
            if (current <= a) {
                System.out.print(", ");
            }
        }
        scanner.close();
    }
}
