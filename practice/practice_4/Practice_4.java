package practice.practice_4;

public class Practice_4 {
    public static void main (String[] args) {
//        RightTriangle rt1 = new RightTriangle(3, 4);
//        RightTriangle rt2 = new RightTriangle(5, 6);
//        rt1.firstLeg = 3;
//        rt1.secondLeg = 4;
//        Circle c1 = new Circle(12, 0, 0);
//        Circle c2 = new Circle(11, 3, 5);
//
//        if (c1.haveSameArea(c2)) {
//            System.out.print("Circles have same area.\n");
//        } else {
//            System.out.print("Circles have different area.\n");
//        }
//        if (rt1.isSimilar(rt2)) {
//            System.out.print("Triangles are similar.\n");
//        } else
//            System.out.print("Triangles are not similar.\n");
//        System.out.println(rt1.perimeter());
//        System.out.println(rt2.triangleSpace());
        ComplexNumbers cn1 = new ComplexNumbers(1, 3);
        ComplexNumbers cn2 = new ComplexNumbers(-1, 2);
        System.out.printf("Module of cn1 is: %f\n", cn1.moduleOfComplexNumber());
        System.out.printf("Module of cn2 is: %f\n", cn2.moduleOfComplexNumber());
        System.out.printf("Module of sum is: %f\n", cn1.moduleOfSum(cn2));
        cn1.sumOfComplexNumbers(cn2).printComplexNumber();
        cn1.mulOfComplexNumbers(cn2).printComplexNumber();
        cn1.fracOfComplexNumbers(cn2).printComplexNumber();
//        helpTeacher();
    }

    public static int random (int lowerPoint, int upperPoint) {
        int res;
        res = (int) ((Math.random() * (upperPoint - lowerPoint)) + lowerPoint);
        return res;
    }

    public static void helpTeacher () {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9};
//        int[] nums = {2, 3};
        int[] usedFirstNums = new int[15];
        int[] usedSecondNums = new int[15];
        int firstMultiplier;
        int secondMultiplier;
        for (int i = 0; i < usedFirstNums.length; i++) {
            firstMultiplier = nums[random(0, 8)];
            secondMultiplier = nums[random(0, 8)];
            int in = 0;
            while (in < i) {
                while (((usedFirstNums[in] == firstMultiplier) && (usedSecondNums[in] == secondMultiplier))
                        || ((usedSecondNums[in] == firstMultiplier) && (usedFirstNums[in] == secondMultiplier))) {
                    firstMultiplier = nums[random(0, 8)];
                    secondMultiplier = nums[random(0, 8)];
                    in = 0;
                }
                in++;
            }
            usedFirstNums[i] = firstMultiplier;
            usedSecondNums[i] = secondMultiplier;
            System.out.printf("\nStudent №%d: %d * %d", i + 1, usedFirstNums[i], usedSecondNums[i]);
        }
    }
}
