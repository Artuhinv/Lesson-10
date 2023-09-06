import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();

        //int a = 10000000;
        //int b = 1000000000;
        long sum = new SumNumbers().sumNumbers(a, b);
        System.out.println("Сумма диапазона [a,b): " + sum);
    }
}