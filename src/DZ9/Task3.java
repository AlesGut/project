package DZ9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите число 1,2 или 3");
        int x = s.nextInt();
        if (x == 1) {
            System.out.println("Вы ввели 1");
        }
        if (x == 2) {
            System.out.println("Вы ввели 2");
        }
        if (x == 3) {
            System.out.println("Вы ввели 3");
        } else {
            System.out.println("Неверно");
        }
    }
}