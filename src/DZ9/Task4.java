package DZ9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите цифру от 1");
        int x = s.nextInt();
        for (int i = x; i <= 9; i = i + 1) {
            System.out.println("4*" + i + "=" + i * 4);
        }
    }
}
