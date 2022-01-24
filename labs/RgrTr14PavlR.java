package labs;

import java.util.Scanner;

public class RgrTr14PavlR {
    public static void main (String[] args) {
        int[] values = new int[3];
        Scanner scan = new Scanner(System.in);
        double[][] matrix = {
                    {1, 8, -5, 3, 10, 117.5},
                    {-3, 5, -3, 5, 5, 92.2},
                    {0, 2, -2, -1, -10, -91.7},
                    {-6, -4, -3, -2, 5, 40.6},
                    {-6, 1, 10, -8, 8, 56.8}
        };
        double[][] triangleMatrix = task11(matrix);
        double[] vector = task12(triangleMatrix);
        System.out.print("Початкова матриця:\n");
        task13(matrix);
        System.out.print("Трикутникова матриця:\n");
        task13(triangleMatrix);
        System.out.print("Вектор результатів:\n");
        task13(vector);
        for (int i = 0; i < values.length; i++) {
            System.out.printf("value %d = ", i + 1);
            values[i] = scan.nextInt();
        }
        for (int value : values) {
            System.out.printf("У числі %d кількість непарних цифр дорівнює %d.\n", value, task2(value));
        }
    }

    public static double[][] task11 (double[][] mat) {
        double[][] triangleMatrix = new double[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(mat[i], 0, triangleMatrix[i], 0, mat[0].length);
        }
        double[] b;
        double k;
        int currentIndex = 1;
        while (currentIndex < triangleMatrix.length) {
            for (int i = currentIndex; i < triangleMatrix.length; i++) {
                if (triangleMatrix[currentIndex - 1][currentIndex - 1] == 0) {
                    b = triangleMatrix[currentIndex - 1];
                    triangleMatrix[currentIndex - 1] = triangleMatrix[currentIndex];
                    triangleMatrix[currentIndex] = b;
                    i--;
                } else if (triangleMatrix[i][currentIndex - 1] != 0) {
                    k = triangleMatrix[currentIndex - 1][currentIndex - 1] / triangleMatrix[i][currentIndex - 1] * -1;
                    for (int j = currentIndex - 1; j < triangleMatrix[0].length; j++) {
                        triangleMatrix[i][j] = k * triangleMatrix[i][j] + triangleMatrix[currentIndex - 1][j];
                    }
                }
            }
            currentIndex++;
        }
        return triangleMatrix;
    }

    public static double[] task12 (double[][] mat) {
        double[] res = new double[mat.length];
        int currentIndex = mat.length - 1;
        int jRes = 0;
        double x, sum, b;
        while (currentIndex >= 0) {
            sum = mat[currentIndex][mat[0].length - 1];
            for (int j = 0; j < jRes; j++) {
                sum -= res[j] * mat[currentIndex][mat[0].length - 2 - j];
            }
            x = sum / mat[currentIndex][currentIndex];
            res[jRes] = x;
            jRes++;
            currentIndex--;
        }
        for (int i = 0; i < res.length / 2; i++) {
            b = res[i];
            res[i] = res[res.length - i - 1];
            res[res.length - i - 1] = b;
        }
        return res;
    }

    public static void task13 (Object o) {
        if (o instanceof double[][]) {
            double[][] mat = (double[][]) o;
            for (double[] i:mat) {
                for (double j:i) {
                    if (Math.abs(Math.round(j) - j) < Math.pow(10, -3)) {
                        System.out.printf("%.0f\t\t", j);
                    } else {
                        System.out.printf("%.3f\t", j);
                    }
                }
                System.out.print("\n");
            }
        } else if (o instanceof double[]) {
            double[] vector = (double[]) o;
            for (int i = 0; i < vector.length; i++) {
                System.out.printf("x%d = ", i + 1);
                if (Math.abs(Math.round(vector[i]) - vector[i]) < Math.pow(10, -3)) {
                    System.out.printf("%.0f\n", vector[i]);
                } else {
                    System.out.printf("%.1f\n", vector[i]);
                }
            }
        }
    }

    public static int task2 (int num) {
        int res = 0, variable;
        for (int i = 0; i < 10; i++) {
            variable = (int) Math.pow(10, i);
            if (variable <= num) {
                if ((num / variable) % 2 != 0) {
                    res++;
                }
            } else {
                return res;
            }
        }
        return res;
    }
}
