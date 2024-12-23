package DZ11;

import java.util.Scanner;

public class Task6DZ11 {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int a = r.nextInt();
        int i = 0;
        int[] x = new int[a];
        int min = x[0];
        int max = x[0];

        while (i < a) {


            Scanner s = new Scanner(System.in);
            System.out.println("Введите значение ячейки " + i);
            int e = s.nextInt();
            x[i] = e;
            i++;

        }
        for (int t : x) {
            if (t > max) {
                max = t;
            }


        }
        for (int t : x) {

            if (t < min) {
                min = t;
            }
        }
        System.out.println("Вы ввели массив");
        for (i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);

    }
}