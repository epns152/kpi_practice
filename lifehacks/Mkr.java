package lifehacks;



public class Mkr {
    public static void main(String[] args) {
        System.out.println(hui("bebra", 3));
//        System.out.println(sum(0.4, 0));
        System.out.println(trees("11213343"));
    }


    public static String hui(String str, int n) {
        char[] charr = str.toCharArray();
        char[] result = new char[charr.length * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < charr.length; j++) {
                result[i * charr.length + j] = charr[j];
            }
        }
        return String.copyValueOf(result);
    }

    public static double sum(double x, int notk){
        int facorialK;
        double y = 0;
        for (int k = 0; k < 5; k++) {
            if (k != notk) {
                facorialK = 1;
                for (int i = 1; i <= k + 1; i++) {
                    facorialK *= i;
                }
                y += (Math.pow(-1, k) * Math.pow(x, k + 2)) / facorialK;
            }
        }
        return y;
    }

    public static boolean trees(String str) {
        char[] cha = str.toCharArray();
        char curr;
        for (int i = 0; i < cha.length - 3; i++) {
            if (cha[i] == cha[i + 1] && cha[i + 1] == cha[i + 2]) {
                return false;
            }
        }
        return true;
    }
}
