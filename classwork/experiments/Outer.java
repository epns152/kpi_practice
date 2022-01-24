package classwork.experiments;

public class Outer extends Root {

    public Outer(int age, String name) {
        setAge(age);
        setName(name);
        if (getAge() >= 20) {
            setName(getName() + " adult");
            setAlreadyAdult();
        }
    }

    public void printData() {
        System.out.printf("name is: %s\nvalue is: %d\n", getName(), getAge());
        setAge(getAge() + 1);
        if (getAge() >= 20 && !getAlreadyAdult()) {
            setName(getName() + " adult");
            setAlreadyAdult();
        }
    }
}
