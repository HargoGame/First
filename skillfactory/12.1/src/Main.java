import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Double> set = new TreeSet<>();

        set.add(21.5);
        set.add(14.2);
        set.add(8d); // 1
        set.add(8.0);

        System.out.println(set);
    }
}