package HomeWork11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HomeWork11Task1_5 {

// First task
    static String oddNames(List<String> names) {
        return   IntStream
                .range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(","));
    }
    // Second task
    static List<String> uppercaseAndRevers(List<String> names){

        return names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Collections.reverseOrder())
                // .collect(Collectors.joining(",")); if we must return String
                .collect(Collectors.toList());
    }
    // The thirt task
    static String sortMassive(String[] words){

        String res = Arrays.stream(words)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
        return res;
    }
    // The four task
    static List<Long> lineGenerator(long seed ,long a,long c, long m){
        Stream<Long> stream = Stream.iterate(seed, x -> (a * x + c) % m);
        return stream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
    // Five task
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> resalt = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext()&&iterator2.hasNext()){
            resalt.add(iterator1.next());
            resalt.add(iterator2.next());
        }
        return resalt.stream();
    }
}
