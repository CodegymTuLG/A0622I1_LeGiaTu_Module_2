package ss10_DSA.linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(1);
        ll.addFirst(12);
        ll.addFirst(10);

        ll.add(2,9);

        ll.printList();
        System.out.println("");
        ll.addlast(2);
        ll.printList();
    }
}
