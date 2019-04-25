package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(listToStringWithOddNumbers(Arrays.asList("John","Mike","Mari","Julia", "Tomas")));
    }

    public static String listToStringWithOddNumbers(List<String> names){
        AtomicInteger index = new AtomicInteger(-1);
        return names.stream()
                .filter(e -> index.incrementAndGet() % 2 != 0)
                .map(e -> index.get() + "." + e)
                .collect(Collectors.joining(", "));
    }
}
