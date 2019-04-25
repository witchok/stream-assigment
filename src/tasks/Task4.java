package tasks;

import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long)1 << 48;
        generate(a,c,m,1)
                .limit(100)
                .forEach(System.out::println);
    }

    public static Stream<Long> generate(long a, long c,long m,long seed){
       return Stream.iterate(seed, x -> a * ( x + c ) % m)
                .skip(1);
    }
}
