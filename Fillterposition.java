import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Fillterposition {  public static List<Integer> removeOddPositions(List<Integer> lst) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < lst.size(); i += 2) {
            result.add(lst.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        List<Integer> inputList = new ArrayList<>();
        
        while (scanner.hasNextInt()) {
            inputList.add(scanner.nextInt());
        }
        
        List<Integer> outputList = removeOddPositions(inputList);
        
        for (int num : outputList) {
            System.out.println(num);
        }
    }
    }
}
    

