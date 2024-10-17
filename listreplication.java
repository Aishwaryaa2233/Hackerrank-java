import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listreplication {
    
    public static List<Integer> repeatElements(int S, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            for (int i = 0; i < S; i++) {
                result.add(num);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
   
        try (Scanner sc = new Scanner(System.in)) {
           
            int S;
            do {
                System.out.print("Enter S (1 <= S <= 100): ");
                S = sc.nextInt();
            } while (S < 1 || S > 100);
            
            List<Integer> arr = new ArrayList<>();
            System.out.println("Enter integers (0 <= x <= 10, enter a non-integer to stop):");
            
            // Input for array elements with constraint 0 <= x <= 10
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num >= 0 && num <= 10) {
                    arr.add(num);
                } else {
                    System.out.println("Number must be between 0 and 10. Please enter again.");
                }
            }
            
            List<Integer> result = repeatElements(S, arr);
            
            for (int num : result) {
                System.out.println(num);
            }
        }
    }
}
