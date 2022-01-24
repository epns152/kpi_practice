package classwork.experiments;

public abstract class Root {
    private int age;
    private String name;
    private boolean alreadyAdult = false;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAlreadyAdult() {
        this.alreadyAdult = true;
    }

    public boolean getAlreadyAdult() {
        return alreadyAdult;
    }
}
