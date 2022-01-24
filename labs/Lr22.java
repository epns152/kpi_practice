package labs;

import java.util.Scanner;
import static java.lang.Math.*;

public class Lr22 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double[] a = new double[3];
        double[] b = new double[3];
        double[] c = new double[3];
        double[] a4 = {3, 13, 10};
        double[] b4 = {5, 8, 5};
        double[] c4 = {4, 11, 12};
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%nEnter %s set of values:%n", i + 1);
            System.out.print("a = ");
            a[i] = s.nextDouble();
            System.out.print("b = ");
            b[i] = s.nextDouble();
            System.out.print("c = ");
            c[i] = s.nextDouble();
        }
        System.out.println("task 3");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%s set of values:%n" +
                    "a = %.4f       b = %.4f        c = %.4f%n" +
                    "And a result is: %s%n", i + 1, a[i], b[i], c[i], task3(a[i], b[i], c[i]));
        }
        System.out.println("task 4");
        for (int i = 0; i < a4.length; i++) {
            System.out.printf("%s set of values:%n" +
                    "a = %.4f       b = %.4f        c = %.4f%n" +
                    "And a result is: %s%n", i + 1, a4[i], b4[i], c4[i], task3(a4[i], b4[i], c4[i]));
        }
    }

    public static String task3 (double a, double b, double c) {
        double minSide = min(min(a, b), c);
        double squareS = pow(minSide, 2);
        double p = (a + b + c) / 2;
        double triangleS = sqrt(p * (p - a) * (p - b) * (p - c));
        if (squareS == triangleS) {
            return "square's area is equal to triangle's area.";
        } else if (squareS > triangleS) {
            return "square's area is higher than triangle's area.";
        } else
            return "square's area is lower than triangle's area.";
    }
}
