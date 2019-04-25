package tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("rough","bawAfs", "assa", "0", "w");
        List<String> processedStrings = mapListOfStringsToUppercaseAndSortDesc(strings);
        processedStrings.forEach(System.out::println);
    }

    public static List<String> mapListOfStringsToUppercaseAndSortDesc(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
