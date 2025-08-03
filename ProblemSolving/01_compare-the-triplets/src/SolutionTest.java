import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < 1 || a.get(i) > 100 || b.get(i) < 1 || b.get(i) > 100) {
                throw new IllegalArgumentException("Scores must be between 1 and 100.");
            }
        }

        List<Integer> result = new ArrayList<>(Arrays.asList(0, 0));

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }

        return result;
    }
}

public class SolutionTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Integer> a = Stream.of(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        System.out.println(result.get(0) + " " + result.get(1));

        scanner.close();
    }
}
