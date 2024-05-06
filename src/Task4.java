import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Совершенные числа в диапазоне от 0 до 1 000 000: ");
        for (int i = 0; i <= 1_000_000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum +=i;
            }
        }
        return sum == number;
    }
}

