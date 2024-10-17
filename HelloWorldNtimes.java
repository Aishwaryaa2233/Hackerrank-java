import java.util.Scanner;

public class HelloWorldNtimes {
    public static void printHelloWorld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTimes = scanner.nextInt();
        printHelloWorld(numberOfTimes);
        scanner.close();
    }
}

