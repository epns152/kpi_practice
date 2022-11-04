package practice;

//import own_jokes.Matrix;

import java.util.Arrays;

public class Practice_5 {
    public static void main (String[] args) {

//        task1
//        double[] arr1 = {123, 412, 2, 21, 243, 21, 24, 5, 743, 22, 6, 7};
        double[] arr1 = randomArray(1000, 0, 100);
//        int[] arr11 = {21, 243, 21};
//        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 10};
//        int[] arr3 = {2};
//        int[] arr4 = {1, 3};
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(isProgress(bubbleSort(arr1)));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(bubbleSort(arr2)));
//        System.out.println(isProgress(bubbleSort(arr2)));
//        mergeSort(arr1);
        double start = System.nanoTime();
        System.out.println(Arrays.toString(mergeSort(arr1)));
        double end = System.nanoTime();
        System.out.println(end - start);
        start = System.nanoTime();
        System.out.println(Arrays.toString(bubbleSort(arr1)));
        end = System.nanoTime();
        System.out.println(end - start);

//        task2
//        double[][] rm1 = randomMatrix(4, 4, -5, 5);
//        double[][] rm2 = randomMatrix(4, 4, -5, 5);
//        double[][] mul = multMatrix(rm1, rm2);
//        print3Matrix(rm1, rm2, mul);

//        task3
//        double[][] matrix = randomMatrix(4, 4, -5, 5);
//        double[] underDiagonal = underDiagonal(matrix);
//        System.out.println("\n" + Arrays.toString(underDiagonal) + "\n");
//        printMatrix(matrix);
//        underDiagonal = mergeSort(underDiagonal);
//        System.out.println("\n" + Arrays.toString(underDiagonal) + "\n");
//        printMatrix(enterUnderDiagonal(underDiagonal, matrix));

//        task4
//        String[] students = {"Whitehead", "Dorsey", "Andrews", "Armstrong", "Fitzgerald", "Griffin", "Dalton", "Malone", "Moody", "Nelson", "Walsh", "Gordon", "Gibbs", "Daniel", "Thompson", "Carson", "Moore", "Powers", "West", "Stevenson", "Harper", "Barton", "Waters", "Watts", "Taylor"};
//        double[] results = randomArray(25, 12, 15);
//        System.out.println(Arrays.toString(results));
//        bestRunners(students, results, 4);

//        task5(6)
//        printMatrix(multiplication(10, 10));
    }

    public static double[] bubbleSort(double[] arr) {
        double b;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    b = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = b;
                }
            }
        }
        return arr;
    }

    public static boolean isProgress(int[] arr) {
        int k = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != k) {
                return false;
            }
        }
        return true;
    }

    public static double[] mergeSort(double[] arr) {
        double len = arr.length;
        double[] firstPart = new double[(int)(len / 2)];
        double[] secondPart = new double[(int)(len - firstPart.length)];
        System.arraycopy(arr, 0, firstPart, 0, firstPart.length);
        System.arraycopy(arr, firstPart.length, secondPart, 0, secondPart.length);
//        System.out.println(Arrays.toString(firstPart) + Arrays.toString(secondPart));
        if (firstPart.length == 1 && secondPart.length == 2) {
            secondPart = mergeSort(secondPart);
        } else if (firstPart.length > 1 && secondPart.length > 1){
            firstPart = mergeSort(firstPart);
            secondPart = mergeSort(secondPart);
        }
        arr = mergeAdding(firstPart, secondPart);
        return arr;
    }

    public static double[] mergeAdding(double[] firstPart, double[] secondPart) {
        double[] res = new double[firstPart.length + secondPart.length];
        if (firstPart[firstPart.length - 1] <= secondPart[0]) {
            System.arraycopy(firstPart, 0, res, 0, firstPart.length);
            System.arraycopy(secondPart, 0, res, firstPart.length, secondPart.length);
        } else if (firstPart[0] >= secondPart[secondPart.length - 1]) {
            System.arraycopy(secondPart, 0, res, 0, secondPart.length);
            System.arraycopy(firstPart, 0, res, secondPart.length, firstPart.length);
        } else {
            for (int j = 0, i = 0, r = 0; r < res.length; r++) {
                if (firstPart[i] <= secondPart[j]) {
                    res[r] = firstPart[i];
                    i++;
                } else if (firstPart[i] >= secondPart[j]) {
                    res[r] = secondPart[j];
                    j++;
                }
                if (i >= firstPart.length) {
                    System.arraycopy(secondPart, j, res, r + 1, secondPart.length - j);
                    r = res.length;
                } else if (j >= secondPart.length) {
                    System.arraycopy(firstPart, i, res, r + 1, firstPart.length - i);
                    r = res.length;
                }
            }
        }
//        System.out.println(Arrays.toString(res));
        return res;
    }

    public static double[] underDiagonal(double[][] mat) {
        int len = 0;
        for (int i = mat.length - 1; i > 0; ) {
            len += (i * 2 - 1);
            i -= 2;
        }
        double[] res = new double[len];
        for (int j = 0, n = 0; j < mat.length; j++) {
            for (int i = j + 1; i < mat.length; i++) {
                res[n++] = mat[i][j];
            }
        }
        return res;
    }

    public static double[][] randomMatrix(int n, int m, double min, double max) {
        double[][] mat = new double[n][m];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return mat;
    }

    public static void print3Matrix(double[][] amat, double[][] bmat, double[][] cmat) {
        for (double[] doubles : amat) {
            for (int j = 0; j < amat[0].length; j++) {
                System.out.printf("%.0f\t", doubles[j]);
            }
            System.out.print("\n");
        }
        for (double[] doubles : bmat) {
            for (int t = 0; t < amat.length; t++) {
                System.out.print("\t");
            }
            for (int j = 0; j < bmat[0].length; j++) {
                System.out.printf("%.0f\t", doubles[j]);
            }
            System.out.print("\n");
        }
        for (double[] doubles : cmat) {
            for (int t = 0; t < bmat.length + amat.length; t++) {
                System.out.print("\t");
            }
            for (int j = 0; j < cmat[0].length; j++) {
                System.out.printf("%.0f\t", doubles[j]);
            }
            System.out.print("\n");
        }
    }

    public static double[][] multMatrix(double[][] matrix, double[][] secMat) {
        double[][] resMat = new double[matrix.length][secMat[0].length];
        double matEl;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < secMat[0].length; j++) {
                matEl = 0;
                for (int k = 0; k < matrix[0].length; k++) {
                    matEl = matEl + matrix[i][k] * secMat[k][j];
                }
                resMat[i][j] = matEl;
            }
        }
        return resMat;
    }

    public static double[][] enterUnderDiagonal(double[] a, double[][] mat) {
        for (int n = 0; n < a.length;) {
            for (int j = 0; j < mat.length; j++) {
                for (int i = j + 1; i < mat.length; i++) {
                    mat[i][j] = a[n++];
                }
            }
        }
        return mat;
    }

    public static void printMatrix(double[][] mat) {
        for (double[] i:mat) {
            for (double j:i) {
                System.out.printf("%4.2f\t", j);
            }
            System.out.print("\n");
        }
    }

    public static void printMatrix(int[][] mat) {
        for (int[] i:mat) {
            for (int j:i) {
                System.out.printf("%d\t", j);
            }
            System.out.print("\n");
        }
    }

    public static double[] randomArray(int n, double min, double max) {
        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            res[i] = Math.round((Math.random() * (max - min) + min) * 10) / 10.0;
        }
        return res;
    }

    public static void bestRunners(String[] students, double[] results, int countOfMembers) {
        int[] indexes = new int[countOfMembers];
        double[] res = new double[countOfMembers];
        double[] sortedResults = mergeSort(results);
        System.out.println(Arrays.toString(sortedResults));
        for (int i = sortedResults.length - 1; i > sortedResults.length - 1 - countOfMembers; i--) {
            for (int j = 0; j < results.length; j++) {
                if (results[j] == sortedResults[i] && !isInArray(j, indexes)) {
                    res[results.length - i - 1] = results[j];
                    indexes[results.length - i - 1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(indexes));
        for (int i = 0; i < indexes.length; i++) {
            System.out.printf("%s %.1f   ", students[indexes[i]], res[i]);
        }
    }

    public static boolean isInArray(int n, int[] arr) {
        for (int i:arr) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }

    public static int[][] multiplication(int n, int m) {
        int[][] res = new int[n][m];
        for (int i = 0, j = 0; i <= n ;) {
            res[i][j] = (i + 1) * (j + 1);
            if ((i == n - 1) && (j < m - 1)) {
                i = 0;
                j++;
            } else if ((j == m - 1) && (i == n - 1)) {
                return res;
            } else {
                i++;
            }
        }
        return res;
    }
}