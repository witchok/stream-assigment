import java.util.ArrayList;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Stream.of("one", "two", "three", "four")
                .parallel()
                .forEach(strings::add);
        strings.forEach(System.out::println);
    }
}
