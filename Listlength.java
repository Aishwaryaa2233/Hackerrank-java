import java.util.*;

public class Listlength {

    public static int countElements(List<Integer> list) {
        int count = 0;
        
        for (Integer element : list) {
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> inputList = new ArrayList<>();

            while (sc.hasNextInt()) {
                inputList.add(sc.nextInt());
            }
            
            System.out.println(countElements(inputList));
        }
    }
}
