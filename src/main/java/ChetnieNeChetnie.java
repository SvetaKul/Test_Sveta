import java.util.Scanner;

public class ChetnieNeChetnie {

    public static long even;
    public static long odd;

    public static void main(String args[]) {


        Scanner input = new Scanner(System.in);

        System.out.println("введите число");

        long f = input.nextLong();

        for(; f != 0; f = f/10) {

            if (f % 2 == 0)
                even++;
             else
                odd++;

        }
        System.out.println("Четное: " + even + " " + "нечетное: " + odd);



    }
}
