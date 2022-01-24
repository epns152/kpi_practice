package labs;

import static java.lang.Math.*;
import java.util.Scanner;

public class Lr3 {
    public static void main (String[] args) {
        int[] opt1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] opt2 = {213, 42, 12, 32, 312, 2, 8, 64, 32, 3, 634, 32};
        double x1, x2;
        Scanner s = new Scanner(System.in);

        task1(0, 7, 0.2);

        System.out.print("\ninput for task 2 is:\n");
        for (int i : opt1) {
            System.out.printf("%d  ", i);
        }
        System.out.printf("\nresult for task2 is: %d\n", task2(opt1));

        System.out.print("\ninput for task 2 is:\n");
        for (int i : opt2) {
            System.out.printf("%d  ", i);
        }
        System.out.printf("\nresult for task2 is: %d\n", task2(opt2));

        System.out.print("Enter x1: ");
        x1 = s.nextDouble();
        System.out.print("Enter x2: ");
        x2 = s.nextDouble();
        System.out.printf("\nx1 = %.4f\t y = %.4f", x1, task3(x1));
        System.out.printf("\nx2 = %.4f\t y = %.4f", x2, task3(x2));
    }

    public static void task1 (double min, double max, double h) {
        int countOfTabs = (int) ((max - min) / h) + 1;
        double[][] result = new double[countOfTabs][3];
        int iteration = 0;
        double yx, zx;
        for (double x = min; iteration < countOfTabs; iteration++, x += h) {
            x = round(x * 100);
            x /= 100;
            yx = log(x / 2 + 0.1);
            zx = cos((x + 2 * PI) * pow(E, x));
            result[iteration][0] = x;
            result[iteration][1] = yx;
            result[iteration][2] = zx;
        }

        System.out.print("x\t\ty = f(x)\tz = f(x)\n");

        for (iteration = 0; iteration < countOfTabs; iteration++) {
            System.out.printf("%.2f\t%.4f\t\t%.4f\n", result[iteration][0], result[iteration][1], result[iteration][2]);
        }
    }

    public static int task2 (int[] x) {
        int res = 0;
        for (int i : x) {
            if (i > 0) {
                res += i;
            }
        }
        return res * 2;
    }

    public static double task3 (double x) {
        int k = 1;
        double y = 0;
        double facorialK;
        while (k <= 5) {
            facorialK = 1;
            for (int i = 1; i <= k; i++) {
                facorialK *= i;
            }
            y += ((pow(x, k + 2)) / facorialK);
            k++;
        }
        return y;
    }
}
