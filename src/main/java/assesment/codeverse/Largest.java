package assesment.codeverse;

import java.util.*;
import java.util.stream.Stream;

public class Largest {
    public static void main(String[] args) {
        int[] numbers = Stream.of(args).mapToInt(x -> Integer.parseInt(x)).toArray();
        int[] num = Stream.of(args).mapToInt(Integer::parseInt).toArray();
        System.out.println(findLargest(numbers));

    }

    public static Integer findLargest(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("no largest element");
        }
            List<Integer> integers = Arrays.stream(numbers).boxed().toList();
            return integers.stream().max(Comparator.reverseOrder()).get();

    }

}
