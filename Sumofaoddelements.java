import java.util.*;

public class Sumofaoddelements {

    public static int sumOddElements(List<Integer> inputList) {
        int sum = 0;
        for (int num : inputList) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> inputList = new ArrayList<>();
            
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= -100 && num <= 100) {
                    inputList.add(num);
                }
            }
            
            if (inputList.size() >= 1 && inputList.size() <= 100) {
                int outputSum = sumOddElements(inputList);
                System.out.println(outputSum);
            }
        }
    }
}
