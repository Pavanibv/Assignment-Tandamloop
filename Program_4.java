import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program_4 {
    public static Map<Integer, Integer> countMultiples(List<Integer> numbers) {
        Map<Integer, Integer> multipleCount = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            multipleCount.put(i, 0);
        }

        for (int number : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    multipleCount.put(i, multipleCount.get(i) + 1);
                }
            }
        }

        return multipleCount;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        Map<Integer, Integer> result = countMultiples(numbers);

        // Format the output to match the desired format
        System.out.print("{");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            if (entry.getKey() != 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
