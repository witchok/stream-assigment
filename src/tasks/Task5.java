package tasks;

import java.util.Iterator;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("1", "3", "5", "7", "9", "11");
        Stream<String> stringStream2 = Stream.of("2", "4", "6", "8");
        zip(stringStream1,stringStream2)
                .forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondIterator = second.iterator();
        return first
            .filter(e -> secondIterator.hasNext())
            .flatMap(e -> Stream.of(e, secondIterator.next()));
    }
}