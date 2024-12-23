package DZ14;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task10DZ14 {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();
        fruits.add("Иванов");
        fruits.add("Тарабаров");
        fruits.add("Воронин");
        fruits.add("Голубев");
        while (true) {
            while (true) {

                System.out.println("Ввод пользователей");
                Scanner c = new Scanner(System.in);
                String x;
                x = String.valueOf(c.nextLine());
                if (x.equalsIgnoreCase("удалить")) {
                    break;
                }
                fruits.add(x);
                System.out.println(fruits);
            }
            while (true) {
                System.out.println("Удаление пользователей");
                Scanner r = new Scanner(System.in);
                String del;
                del = String.valueOf(r.nextLine());
                fruits.remove(del);
                if (del.equalsIgnoreCase("хватит")) {
                    break;
                }
                System.out.println(fruits);

            }

        }
    }
}


