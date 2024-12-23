package DZ12;

import java.util.Scanner;

public class Task7DZ12 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int n;
        int sum_fib;
        Scanner s = new Scanner(System.in);
        System.out.println("До какого число выводить числа");
        n = s.nextInt();
       // System.out.print(a + " " + b + " ");
        for (int i = 0; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }
}
