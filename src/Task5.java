import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("1", "3", "5", "7", "9", "11");
        Stream<String> stringStream2 = Stream.of("2", "4", "6", "8");
        zip(stringStream1,stringStream2).forEach(System.out::println);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> builder = Stream.builder();
        List<T> collect1 = first.collect(Collectors.toList());
        List<T> collect2 = second.collect(Collectors.toList());
        long len = collect1.size() > collect2.size() ? collect2.size() : collect1.size();
        for (int i = 0; i < len; i++) {
            builder.add(collect1.get(i))
                    .add(collect2.get(i));
        }
        return builder.build();
    }
}