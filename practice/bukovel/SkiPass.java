package practice.bukovel;

import java.util.Calendar;

public abstract class SkiPass {
    private final Calendar creationDate;
    private final Calendar expirationDate;
    protected int slopes = 0;
    protected int startSkiing = 0;
    protected int endSkiing = 0;
    protected int countOfSlopes = 0;
    protected int countOfDays = 0;
    private boolean block;
    private int id;

    public SkiPass() {
        this.creationDate = Calendar.getInstance();
        this.expirationDate = Calendar.getInstance();
        int year;
        if (creationDate.get(Calendar.MONTH) > 3) {
            year = creationDate.get(Calendar.YEAR) + 1;
        } else {
            year = creationDate.get(Calendar.YEAR);
        }
        this.expirationDate.set(year, Calendar.MAY, 1, 0, 0, 0);
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void info() {
        System.out.println("Id: " + id);
        System.out.println("Creation date: " + creationDate.getTime());
        System.out.println("Expiration date: " + expirationDate.getTime());
        System.out.println("Count of slopes: " + slopes);
        System.out.println("Block status: " + block);
    }
}
