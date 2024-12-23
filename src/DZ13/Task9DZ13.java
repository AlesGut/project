package DZ13;

import java.util.Scanner;

public class Task9DZ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Считываем размеры строки и столбца у пользователя
        System.out.println("Введите размеры строки и столбца: ");
        int sum = 0;
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] array = new int[row][column];

        // Считываем элементы массива
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        // Выводим элементы массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }System.out.println("Сумма равна " + sum);
    }
}