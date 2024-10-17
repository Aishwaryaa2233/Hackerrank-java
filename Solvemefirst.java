import java.util.Scanner;

public class Solvemefirst {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (isValid(a) && isValid(b)) {
            int sum = solveMeFirst(a, b);
            System.out.println(sum);
        } else {
            System.out.println("Error: Both numbers must be between 1 and 1000.");
        }

        scanner.close();
    }

    public static int solveMeFirst(int x, int y) {
        return x + y;
    }

    public static boolean isValid(int number) {
        return number >= 1 && number <= 1000;
    }
}
