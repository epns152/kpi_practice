package labs;

import java.util.Date;
import java.util.Scanner;

public class Lr1 {
	public static void main(String[] args) {
		double a, b, t, y, s;
		a = -0.5;
		b = 1.7;
		t = 0.44;
		y = (double) Math.round(calcY(a, b, t) * 10000) / 10000;
		s = (double) Math.round(calcS(a, b, t) * 10000) / 10000;
		System.out.printf("Value of y: %s %n", y);
		System.out.printf("Value of s: %s %n", s);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter new value of 'a': ");
		a = scan.nextDouble();
		System.out.print("Enter new value of 'b': ");
		b = scan.nextDouble();
		System.out.print("Enter new value of 't': ");
		t = scan.nextDouble();
		y = (double) Math.round(calcY(a, b, t) * 10000) / 10000;
		s = (double) Math.round(calcS(a, b, t) * 10000) / 10000;
		a = (double) Math.round(a * 10000) / 10000;
		b = (double) Math.round(b * 10000) / 10000;
		t = (double) Math.round(t * 10000) / 10000;
		System.out.printf("Value of a: %s; %n", a);			// 1
		System.out.printf("Value of b: %s; %n", b);			// -1
		System.out.printf("Value of t: %s; %n", t);			// 23.1234
		System.out.printf("Value of s: %s; %n", s);
		System.out.printf("Value of y: %s; %n", y);
		System.out.printf("Value of y: %f; %n", y);
		outputDate();
	}

	public static double calcY (double a, double b, double t) {
		double y;
		y = Math.pow(Math.E, -b * t) * Math.sin(a * t + b) - Math.sqrt(Math.abs(b * t +a));
		return(y);

	}

	public static double calcS (double a, double b, double t) {
		double s;
		s = b * Math.sin(a * Math.pow(t, 2) * Math.cos(2 * t)) - 1;
		return(s);
	}

	public static void outputDate() {
		Date d = new Date();
		System.out.printf("%td %tB %tY", d, d, d);
	}
}
