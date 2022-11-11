package glava_3.paketi;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Example001 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введенные число: "+a);
        System.out.println("//////////////////////////////////");
        double result = sqrt(a);
        System.out.println(result);
    }
}
