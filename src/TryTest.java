import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TryTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//
//        list.stream()
//            .sorted()
//            .peek(list::remove)
//            .forEach(System.out::println); // nothing 1 1
//
//        System.out.println(list.size()); // 0 1 0

        final List<Integer> ints = new ArrayList<>();

        IntStream.range(0, 1000)
                .parallel()
                .forEach(ints::add);
        ints.forEach(System.out::println);
    }
}
