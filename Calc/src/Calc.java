import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char calcOperator = 'c';
        double result = 0;
        double num1;
        double num2;
        char oper;

        do {
            if (calcOperator == 'c') {
                System.out.println("введите первое число: ");
                num1 = scanner.nextDouble();
                System.out.println("дели умножай минусуй или плюсуй: ");
                oper = scanner.next().charAt(0);
            } else {
                num1 = result;
                oper = calcOperator;
            }

            System.out.println("введите второе число: ");
            num2 = scanner.nextDouble();

            result = calc2(num1, num2, oper);
            System.out.println("ответом будет: " + result);

            calcOperator = scanner.next().charAt(0);

        } while (calcOperator != 's');

    }

    public static double calc2(double num1, double num2, char oper) {
        return switch (oper) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> {
                System.out.println("Другие операции я еще не научился делать ;) ");
                yield 0;
            }
        };
    }
}