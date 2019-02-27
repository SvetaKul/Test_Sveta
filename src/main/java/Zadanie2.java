public class Zadanie2 {

    public static void main(String args[]) {

        int a = 10;
        int b = 30;
        int c = 20 - a;
        int d = 20 - b;


        if (Math.abs (c) == Math.abs(d)) {
            System.out.println("Равноудалены");
        }
        else if (Math.abs (c) > Math.abs(d)) {
            System.out.println("Ближайшее число к 20 = " + b);
        }
        else  {
            System.out.println("Ближайшее число к 20 = " + a);
        }

    }
}
