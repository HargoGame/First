import java.text.NumberFormat;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        
        final double boxPrice = 3.50;
        Scanner keybord = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        out.print("Сколько коробок вы насчитали? ");
        String numBoxesIn = keybord.next();
        
        try {
            int numBoxes = Integer.parseInt(numBoxesIn);
            
            if (numBoxes < 0) {
                throw new OutOfRangeException();
            }

            out.print("Общая стоимость равна: ");
            out.println(currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            out.println("Это не число.");
        } catch (OutOfRangeException e) {
            out.print(numBoxesIn);
            out.println("? Это невозможно.");
        }

        keybord.close();
    }

    static class OutOfRangeException extends Exception{

    }
}

