package practice;

import java.util.Scanner;

public class Practice_2 {
    public static void main (String[] args) {
//        int a, b, c, randA, randB;
//        randA = (int) (Math.random() * 20);
//        randB = (int) (Math.random() * 20);
        Scanner scan = new Scanner(System.in);
//        a = input(scan);
//        b = input(scan);
//        c = input(scan);

//        System.out.println(diff21(12));
//        System.out.println(diff21(21));
//        System.out.println(diff21(22));

//        System.out.println(nearHundred(90));

//        System.out.println(nearHundredMod(1210));
//        System.out.println(nearHundredMod(1211));
//        System.out.println(nearHundredMod(1289));
//        System.out.println(nearHundredMod(1290));

//        System.out.println(sleepIn(false, false));
//        System.out.println(sleepIn(true, false));
//        System.out.println(sleepIn(false, true));
//        System.out.println(sleepIn(true, true));

//        System.out.println(isInRange(a, b, c));
//        System.out.println(isInRange(20, 20, 10));
//        System.out.println(isInRange(20, 10, 13));

//        System.out.println(close10(randA, randB));
//        System.out.println(close10(8, 13));
//        System.out.println(close10(13, 8));
//        System.out.println(close10(13, 7));

        guessingProg(scan);
//        guessingProgMod(scan);
//        guessingProgModRand(scan);
    }

    public static int input (Scanner scan) {
        System.out.print("Enter a num: ");
        return scan.nextInt();
    }

    public static int random (int lowerPoint, int upperPoint) {
        int res;
        res = (int) ((Math.random() * (upperPoint - lowerPoint)) + lowerPoint);
        return res;
    }

    public static int diff21 (int n) {
        return 21 < n ? Math.abs(21 - n) * 2 : Math.abs(21 - n);
    }

    public static boolean nearHundred (int n) {
        return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
    }

    public static boolean nearHundredMod (int n) {
        int numberOfHundreds = (n + 10) / 100;
        return n >= numberOfHundreds * 100 - 10 && n <= numberOfHundreds * 100 + 10;
    }

    public static boolean sleepIn (boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    public static boolean isInRange (int a, int b, int c) {
        boolean resA = (a >= 13 && a <= 19);
        boolean resB = (b >= 13 && b <= 19);
        boolean resC = (c >= 13 && c <= 19);
        return resA || resB || resC;
    }

    public static int close10 (int a, int b) {
        int moduleA = Math.abs(10 - a);
        int moduleB = Math.abs(10 - b);
        if (moduleA < moduleB) {
            return a;
        } else if (moduleA > moduleB){
            return b;
        }
        return 0;
    }

    public static void guessingProg (Scanner scan) {
        int num, answer;
        int i = 0;
        int lowerPoint = 0;
        int upperPoint = 1001;
        while (i == 0) {
            System.out.print("Enter a number from 1 to 1000: ");
            num = scan.nextInt();
            if (num < 1 || num > 1000) {
                System.out.println("You entered wrong number! Enter right number, from 1 to 1000");
            } else {
                i++;
            }

        }

        for (i = 1; i <= 10; i++) {
            System.out.printf("Your num is: %s%n", (upperPoint + lowerPoint) / 2);
            System.out.printf("Enter an answer:%n" +
                    "1 - You guesses!%n" +
                    "2 - You didn't guess, my number is lower%n" +
                    "3 - You didn't guess, my number is higher%n");
            answer = scan.nextInt();
            switch (answer) {
                case 1 : {
                    System.out.printf("I tried %s times.%n", i);
                    i += 10;
                    break;
                }
                case 2 : {
                    upperPoint = (upperPoint + lowerPoint) / 2;
                    break;
                }
                case 3 : {
                    lowerPoint = (upperPoint + lowerPoint) / 2;
                    break;
                }
                default : {
                    System.out.printf("There is no answer %s.%n", answer);
                    i--;
                }
            }
        }
    }

    public static void guessingProgMod (Scanner scan) {
        int num, answer, res, i;
        i = 0;
        answer = 3;
        double lowerPoint = 0.0;
        double upperPoint = 1001.0;

        while (i == 0) {
            System.out.print("Enter a number from 1 to 1000: ");
            num = scan.nextInt();
            if (num < 1 || num > 1000) {
                System.out.println("You entered wrong number! Enter right number, from 1 to 1000");
            } else {
                i++;
            }

        }

        for (i = 1; i <= 1000; i++) {
            switch (answer) {
                case 2 : {
                    res = (int) (lowerPoint + Math.round((upperPoint - lowerPoint) / 3));
                    break;
                }
                case 3 : {
                    res = (int) (lowerPoint + Math.round((upperPoint - lowerPoint) * 2 / 3));
                    break;
                }
                default : {
                    continue;
                }
            }
            System.out.printf("Your num is: %s%n", res);
            System.out.printf("Enter an answer:%n" +
                    "1 - You guesses!%n" +
                    "2 - You didn't guess, my number is lower%n" +
                    "3 - You didn't guess, my number is higher%n");
            answer = scan.nextInt();
            switch (answer) {
                case 1 : {
                    System.out.printf("I tried %s times.%n", i);
                    i += 1000;
                    break;
                }
                case 2 : {
                    upperPoint = res;
                    break;
                }
                case 3 : {
                    lowerPoint = res;
                    break;
                }
                default : {
                    System.out.printf("There is no answer %s.%n", answer);
                    i--;
                    break;
                }
            }

        }
    }

    public static void guessingProgModRand (Scanner scan) {
        int num, answer, res;
        int i = 0;
        int lowerPoint = 1;
        int upperPoint = 1001;

        while (i == 0) {
            System.out.print("Enter a number from 1 to 1000: ");
            num = scan.nextInt();
            if (num < 1 || num > 1000) {
                System.out.println("You entered wrong number! Enter right number, from 1 to 1000");
            } else {
                i++;
            }

        }

        for (i = 1; i <= 1000; i++) {
            res = random(lowerPoint, upperPoint);
            System.out.printf("Your num is: %s%n", res);
            System.out.printf("Enter an answer:%n" +
                    "1 - You guesses!%n" +
                    "2 - You didn't guess, my number is lower%n" +
                    "3 - You didn't guess, my number is higher%n");
            answer = scan.nextInt();
            switch (answer) {
                case 1 : {
                    System.out.printf("I tried %s times.%n", i);
                    i += 1000;
                    break;
                }
                case 2 : {
                    upperPoint = res;
                    break;
                }
                case 3 : {
                    lowerPoint = res;
                    break;
                }
                default : {
                    System.out.printf("There is no answer %s.%n", answer);
                    i--;
                    break;
                }
            }

        }
    }
}




