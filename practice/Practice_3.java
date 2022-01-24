package practice;

import java.util.Arrays;

public class Practice_3 {
    public static void main (String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5, 6};

//        System.out.println(Arrays.toString(middleWay(a1, b1)));
//        System.out.println(middleWay(a1, b1)[1]);
//        System.out.println(Arrays.toString(middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0})));
//        System.out.println(Arrays.toString(middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5})));

//        System.out.println(maxTriple(new int[]{5, 2, 13, 11, 9}));

//        System.out.println(countEvens(new int[]{5, 2, 13, 12, 9}));

//        System.out.println(haveThree(new int[]{3, 2, 3, 12}));

//        System.out.println(Arrays.toString(zeroFront(new int[]{1, 1, 1, 1, 0, 1, 1, 0, 0, 2})));

//        System.out.println(Arrays.toString(squareUp(5)));
//        System.out.println(Arrays.toString(squareUpRev(5)));

//        System.out.println(maxSpan(new int[]{1, 1, 1, 1, 0, 1, 1, 0, 0, 2}));
//        System.out.println(maxSpan(new int[]{5, 5, 2, 13, 12, 9}));
    }

    public static int[] middleWay (int[] a, int[] b) {
        return new int[]{a[(a.length - 1) / 2], b[(b.length - 1) / 2]};
    }

    public static int maxTriple (int[] nums) {
        int res;
        int middleIndex = (nums.length - 1) / 2;
        if (nums[0] > nums[middleIndex] && nums[0] > nums[nums.length - 1]) {
            res = nums[0];
        } else res = Math.max(nums[middleIndex], nums[nums.length - 1]);
        return res;
    }

    public static int countEvens (int[] nums) {
        int res = 0;
        for (int i:nums) {
            if (i % 2 == 0) {res++;}
        }
        return res;
    }

    public static boolean haveThree (int[] nums) {
        int countThrees = 0;
        boolean nextCanBeThree = true;
        for (int i:nums) {
            if (i == 3 && nextCanBeThree && countThrees <= 3) {
                nextCanBeThree = false;
                countThrees++;
            } else if (i == 3 && !nextCanBeThree) {
                return false;
            } else if (i == 3) {
                return false;
            } else
                 nextCanBeThree = true;
        }
        return countThrees == 3;
    }

    public static int[] zeroFront (int[] nums) {
        int counter = 0;
        int[] res = new int[nums.length];
        for (int i:nums) {
            if (i != 0) {
                res[res.length - 1 - counter++] = i;
            }
        }
        return res;
    }

    public static int[] squareUp (int n) {
        int counter;
        int[] res = new int[n * n];
        for (int ar = 0; ar < n; ar++) {
            counter = 0;
            for (int i = 1; i <= n; i++) {
                res[(n - ar) * n - i] = ++counter;
                if (i + ar >= n) {
                    break;
                }
            }
        }
        return res;
    }

    public static int[] squareUpRev (int n) {
        int counter;
        int[] res = new int[n * n];
        for (int ar = 0; ar < n; ar++) {
            counter = n - ar;
            for (int i = 1; i <= n; i++) {
                res[(n - ar) * n - i] = counter--;
                if (i + ar >= n) {
                    break;
                }
            }
        }
        return res;
    }

    public static int maxSpan (int[] nums) {
        int res = 1;
        for (int el = 0; el < nums.length; el++) {
            for (int i = el; i < nums.length - el; i++) {
                if (nums[i] == nums[el]) {
                    if (i - el + 1 > res) {
                        res = i - el + 1;
                    }
                }
            }
        }
        return res;
    }
}

