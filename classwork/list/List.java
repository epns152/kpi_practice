package classwork.list;

public class List extends Element {
    private Element head;
    private Element currentElement;
    private int length;

    public List(int value) {
        Element el = new Element();
        el.setValue(value);
        this.head = el;
        this.length = 1;
    }

    public void addElementOnFront(int value) {
        Element el = new Element();
        el.setValue(value);
        el.setLastEl(head);
        this.head = el;
        currentElement = this.head;
        this.length += 1;
    }

    public void addElementOnBack(int value) {
        currentElement = this.head;
        Element el = new Element();
        el.setValue(value);
        while (currentElement.getLastEl() != null) {
            currentElement = currentElement.getLastEl();
        }
        currentElement.setLastEl(el);
        this.length += 1;
    }

    public void printAll() {
        currentElement = this.head;
        while (currentElement != null){
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getLastEl();
        }
    }

    public void printIndex(int index) {
        currentElement = this.head;
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.getLastEl();
        }
        System.out.println(currentElement.getValue());
    }

    public int length() {
        return this.length;
    }
}
