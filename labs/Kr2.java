package labs;

import static java.lang.Math.pow;

public class Kr2 {

    public static void main(String[] args) {
        System.out.println(task2(0.6));
    }

    public static double task2(double x) {
        double y = 0;
        double facorialK;
        for (int k = 1; k <= 5 ; k++) {
            if (k != 3) {
                facorialK = 1;
                for (int i = 1; i <= k; i++) {
                    facorialK *= i;
                }
                y += ((pow(-1, k)) * pow(x + 3, k + 2) / facorialK);
            }
        }
        return y;
    }
}
