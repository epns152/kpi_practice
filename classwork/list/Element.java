package classwork.list;

public class Element {
    private int value;
    private Element lastEl;

    public void setLastEl(Element lastEl) {
        this.lastEl = lastEl;
    }

    public Element getLastEl() {
        return lastEl;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
