package DZ8;

public class Task2DZ8 {
    public static void main(String[] args) {
        int i = 0;
        int summa = 0;
        int a = 0;
        while (i < 100) {
            i++;
            summa = summa + i;
            if (i % 2 == 0) {
                a++;
            }
        }
        System.out.println("Колличество четных чисел " + a);
            System.out.println(i);
        System.out.println("Сумма чисел " + summa);
    }
}
