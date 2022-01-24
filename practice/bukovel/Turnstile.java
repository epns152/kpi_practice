package practice.bukovel;

import java.util.Calendar;

public class Turnstile {
    public static void main(String[] args) {
        MainSystem system = new MainSystem();
        SkiPass pass1 = system.createSkiPass("Weekdays", "evening");
        pass1.info();
        System.out.println();
        SkiPass pass2 = system.createSkiPass("Weekends", 2);
        pass2.info();
        System.out.println();
        SkiPass pass3 = system.createSkiPass("Weekdays", 50);
        pass3.info();
    }
}
