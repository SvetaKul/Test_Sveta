import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        float a=5f;
        float b=3f;

        System.out.println("сумма 5/3=" + (a/b));

        System.out.println("сумма 5%3=" + (a%b));

        int c=2;
        c++;
        System.out.println(c);
        c--;
        c--;
        c++;
        c++;
        c++;
        System.out.println("инкр =" + (++c));

        Scanner input = new Scanner(System.in);

        String gоd, nastroenie;

        System.out.println("Какой сегодня год?");

        gоd = input.nextLine();

        System.out.println("Как настроение?");
        nastroenie = input.nextLine();

        String text;

        text= "сегодня год  " + gоd + "  Настроение " + nastroenie;

        System.out.println(text);




    }
}
