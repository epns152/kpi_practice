package practice.bukovel;

import java.util.Calendar;

public class WeekendsPass extends SkiPass {
    private final int firstAllowableDay = Calendar.SATURDAY;
    private final int lastAllowableDay = Calendar.SUNDAY;

    public WeekendsPass(String daytime, int id) {
        switch (daytime) {
            case "morning":
                startSkiing = 9;
                endSkiing = 13;
                setId(id);
                return;
            case "evening":
                startSkiing = 13;
                endSkiing = 17;
                setId(id);
                return;
            default:
                System.out.println("Entered wrong daytime");
        }
    }

    public WeekendsPass(int count,int id) {
        if (count == 1 || count == 2 || count == 5) {
            countOfDays = count;
        } else if (count == 10 || count == 20 || count == 50) {
            countOfSlopes = count;
        } else {
            System.out.println("Entered wrong number");
            return;
        }
        setId(id);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Week time: weekends");
        if (startSkiing != 0) {
            System.out.println("Type of pass: half day");
            System.out.println("Start: " + startSkiing + "\nEnd: " + endSkiing);
        } else if (countOfSlopes != 0) {
            System.out.println("Type of pass: for limited slopes");
            System.out.println("Count of left slopes: " + countOfSlopes);
        } else if (countOfDays != 0) {
            System.out.println("Type of pass: for days");
            System.out.println("Count of left days: " + countOfDays);
        }
    }
}

