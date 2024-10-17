import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterArray {

    public static List<Integer> filterValues(int x, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num < x) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            
            int B;
            do {
                System.out.print("Enter the upper limit B (1 <= B <= 100): ");
                B = sc.nextInt();
            } while (B < 1 || B > 100);
            
            // Input for x with constraint -100 <= x <= 100
            int x;
            do {
                System.out.print("Enter the filter value x (-100 <= x <= 100): ");
                x = sc.nextInt();
            } while (x < -100 || x > 100);
            
            List<Integer> arr = new ArrayList<>();
            System.out.println("Enter integers for the array (between -100 and 100, enter a non-integer to stop):");
            
            // Input for array elements with constraint -100 <= y <= 100
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num >= -100 && num <= 100) {
                    arr.add(num);
                } else {
                    System.out.println("Number must be between -100 and 100. Please enter again.");
                }
            }
            
            List<Integer> result = filterValues(x, arr); // Filter values less than x
            
            // Print each filtered number
            for (int num : result) {
                System.out.println(num);
            }
        }
    }
}

