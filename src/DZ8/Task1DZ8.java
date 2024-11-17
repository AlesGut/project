package DZ8;
import java.util.Scanner;
public class Task1DZ8 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("введите число");
        int x = s.nextInt();
        System.out.println(x);
        if ( x<1){
            System.out.println("Введите натуральное число");
        }else
            for (int i = 0; i<=x; i = i +1){
                System.out.println( i);
            }
    }
}