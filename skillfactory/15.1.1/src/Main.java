
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ZonedDateTime zdt1 = ZonedDateTime.of(2022, 3, 29, 12, 0, 0, 0, ZoneId.of("Europe/Moscow"));

        System.out.println(zdt1);

        LocalDate date3 = LocalDate.now();
        System.out.println(date3);

        Instant now = Instant.now();

        System.out.println(now);

        Date date1 = new Date();
        Instant instant = date1.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(zonedDateTime);

        LocalDate date = LocalDate.of(2029, 8, 4);
        Period period = Period.ofDays(3);
        date = date.minus(period); // строка 1
        Duration duration = Duration.ofHours(12);
        LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.of(8, 0));
        dateTime.plus(duration); // строка 2
        System.out.println(dateTime);

        BiFunction<String, String, Integer> biFunction = String::indexOf;
        BiPredicate<String, String> biPredicate = String::contains;
        Function<String, Integer> function = Integer::valueOf;
        Consumer<List<Double>> consumer = Collections::sort;



        Stream<Double> stream = Stream.of(1d, 2.94d, 2.33d);
        System.out.println(stream.min((d1, d2) -> (int) (d1 - d2)).orElse(0d));

        Stream<Integer> infinite = Stream.iterate(2, x -> x * 2);
        System.out.println(infinite.anyMatch(test -> test / 8 == 0));

        Stream<Integer> stream2 = Stream.iterate(1, integer -> integer + 1);
        boolean match = stream2
                .map(String::valueOf)
                .distinct()
                .limit(5)
                .noneMatch(str -> str.length() != 1);
        System.out.println(match);


        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list
                .stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        Stream<String> stream4 = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream4.limit(2).map(x -> x + "2"));




    }


}





    
