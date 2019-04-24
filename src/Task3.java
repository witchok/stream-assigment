import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        List<String> givenCollection = Arrays.asList("1,2,0","4,5");
        List<Integer> separatedNumbers = getSeparatedNumbers(givenCollection);
        separatedNumbers.forEach(System.out::println);
    }
    public static List<Integer> getSeparatedNumbers(List<String> strings){
        return strings.stream()
                .flatMap(str -> Stream.of(str.split(",")))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
