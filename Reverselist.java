import java.util.*;

public class Reverselist {

    public static List<Integer> reverseList(List<Integer> inputList) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = inputList.size() - 1; i >= 0; i--) {
            reversedList.add(inputList.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> inputList = new ArrayList<>();
            
            while (scanner.hasNextInt()) {
                inputList.add(scanner.nextInt());
            }
            
            List<Integer> outputList = reverseList(inputList);
            for (int num : outputList) {
                System.out.println(num);
            }
        }
    }
}
