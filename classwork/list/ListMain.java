package classwork.list;

public class ListMain {
    public static void main(String[] args) {
        List list = new List(12);
        list.addElementOnFront(3);
        list.addElementOnFront(3);
        list.addElementOnFront(3);
        list.addElementOnFront(3);
        list.printAll();
        list.addElementOnBack(4);
        System.out.println();
        list.printAll();
        System.out.println();
        list.printIndex(5);
        System.out.println(list.length());
    }
}
