import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int input = sc.nextInt();
        boolean b = true;
        for (int p = 2; p <= input; p++) {
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(p);
            else b = true;
        }
    }
}
