package labs;

import static java.lang.Math.*;

public class Lr21 {
    public static void main (String[] args) {
        double[] x = {-2.3, 0.6, 4.8};
        double[] a = { 0.1, 1.2, 2.5};
        double[] b = { 0.5, 2.5, 1.2};

        for (double i : x) {
            System.out.printf("%nInput for task1 is: %.4f\t" +
                    "Result for task1 = %.4f%n", i, task1(i));
        }
        for (double i : x) {
            for (int abArgs = 0; abArgs < a.length; abArgs++) {
                System.out.printf("%nInputs for task2 is:%n" +
                        "x = %.4f   a = %.4f    b = %.4f\t" +
                        "Result for task2 = %.4f%n", i, a[abArgs], b[abArgs], task2(i, a[abArgs], b[abArgs]));
            }
        }
    }

    public static double task1 (double x) {
        double a, b, z, y;
        a = 0.7;
        b = -1.25;
        z = 3.5;
        if (x < a) {
            y = (2.8 * pow(sin(a * x), 2)) - (b * pow(x, 3) * z);
        } else if (a <= x && x <= pow(b, 2)) {
            y = z * cos(pow(a * x + b, 2));
        } else {
            y = (pow(E, abs(2.5 * a * x))) + (z * a * b * x);
        }
        return y;
    }

    public static double task2 (double x, double a, double b) {
        double y, z;
        z = pow(E, 2.5 * a * x);
        if (x <= a) {
            y = (3.5 * pow(sin(pow(b * x + z, 3)), 2)) - (pow(E, 3.5 * a));
        } else if (x < pow(b, 2.5)) {
            y = log(a + pow(b, 3) * x) + a;
        } else {
            y = pow(cos(pow(a, b) + x * z), 2) + pow(a, 2);
        }
        return y;
    }
}
