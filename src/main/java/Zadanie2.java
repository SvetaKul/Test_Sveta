import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);


        System.out.println("введите число");

        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число " + a + " четное");
        } else {
            System.out.println("Число " + a + " нечетное");
        }


        System.out.println("введите второе число");
        int b = input.nextInt();

        if (b % 2 == 0) {
            System.out.println("Число " + b + " четное");
        } else {
            System.out.println("Число " + b + " нечетное");
        }


        if (Math.abs(20 - a) == Math.abs(20 - b)) {
            System.out.println("Введенные числа равноудалены");
        } else if (Math.abs(20 - a) > Math.abs(20 - b)) {
            System.out.println("Ближайшее число к 20 = " + b);
        } else {
            System.out.println("Ближайшее число к 20 = " + a);
        }

        Random rand = new Random();
        int s = rand.nextInt(151) + 5;
        if ((25 <= s) && (s <= 100))
            System.out.printf("Рандомное число отрезка [5;155] " + s + " попало в отрезок чисел от 25 до 100");
        else System.out.printf("Рандомное число отрезка [5;155] " + s + " не попало в отрезок чисел от 25 до 100)");


    }
}

