import static java.lang.Math.*;

public class Task9{

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 4;

        System.out.println("Math Operations with Static Import");
        System.out.println("===================================");
        System.out.println("Values: a = " + x + ", b = " + y);
        System.out.println();

        System.out.println("Addition      (" + x + " + " + y + ")  = " + add(x, y));
        System.out.println("Subtraction   (" + x + " - " + y + ")  = " + subtract(x, y));
        System.out.println("Multiplication(" + x + " * " + y + ")  = " + multiply(x, y));
        System.out.println("Division      (" + x + " / " + y + ")  = " + divide(x, y));

        System.out.println();

        int p = 15;
        int q = 6;

        System.out.println("Values: a = " + p + ", b = " + q);
        System.out.println();

        System.out.println("Addition      (" + p + " + " + q + ")  = " + add(p, q));
        System.out.println("Subtraction   (" + p + " - " + q + ")  = " + subtract(p, q));
        System.out.println("Multiplication(" + p + " * " + q + ")  = " + multiply(p, q));
        System.out.println("Division      (" + p + " / " + q + ")  = " + divide(p, q));
    }
}