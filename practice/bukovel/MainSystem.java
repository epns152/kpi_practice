package practice.bukovel;

public class MainSystem {
    private int id = 1;

    public SkiPass createSkiPass(String typeOfPass, String daytime) {
        SkiPass pass = null;
        if (typeOfPass.equals("Weekdays")) {
            pass = new WeekdaysPass(daytime, this.id);
        } else if (typeOfPass.equals("Weekends")) {
            pass = new WeekendsPass(daytime, this.id);
        } else {
            System.out.println("Entered wrong type of pass");
        }
        id++;
        return pass;
    }

    public SkiPass createSkiPass(String typeOfPass, int countOfDays) {
        SkiPass pass = null;
        if (typeOfPass.equals("Weekdays")) {
            pass = new WeekdaysPass(countOfDays, this.id);
        } else if (typeOfPass.equals("Weekends")) {
            pass = new WeekendsPass(countOfDays, this.id);
        } else {
            System.out.println("Entered wrong type of pass");
        }
        id++;
        return pass;
    }
}
