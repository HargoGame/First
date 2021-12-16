import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.addPrice(50);
        Orange orange1 = new Orange();
        orange1.addPrice(100);
        System.out.println("Total cost: " + Orange.orangePrice);

    }

    public static class Orange {
        public static int orangePrice = 0;

        public void addPrice(int price) {
            int n = 50;
            int n2 = 100;
            orangePrice = n + n2;
            

            // write your code here
        }
    }
}