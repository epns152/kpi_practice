package labs;

public class Kr1 {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Ab", 3));
    }

    public static String frontTimes(String str, int n) {
        char[] arr = str.toCharArray();
        int len;
        if (arr.length >= 3) {
            len = 3 * n;
        } else {
            len = arr.length * n;
        }
        char[] result = new char[len];
        for (int i = 0; i < n; i++) {
            if (arr.length >= 3) {
                System.arraycopy(arr, 0, result, i * 3, 3);
            } else {
                System.arraycopy(arr, 0, result, i * arr.length, arr.length);
            }
        }
        return String.copyValueOf(result);
    }
}
