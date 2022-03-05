import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(93);
        list.add(62);
        list.add(14);
        list.add(94);
        list.add(8);
        list.add(101);
        list.add(55);

        int largest = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
