import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayofnElements {

    public static List<Integer> createArray(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            List<Integer> output = createArray(n);
            
            for (int num : output) {
                System.out.print(num + " ");
            }
        }
    }
}

