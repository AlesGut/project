package DZ12;

import java.util.Scanner;

public class Task8DZ12 {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sum = 0;
        int a = r.nextInt();
        int i = 0;
        int[] x = new int[a];
        while (i < a) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите значение ячейки " + i);
            int e = s.nextInt();
            x[i] = e;
            i++;
        }

        for (int t : x) {
            if (t % 2 == 0) {
                sum = sum + t;
            }
        }
        System.out.println("Вы ввели массив");

        for (i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Сумма четных " + sum);

    }
}
