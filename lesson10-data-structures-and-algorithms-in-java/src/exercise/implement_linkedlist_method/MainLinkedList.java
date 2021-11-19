package exercise.implement_linkedlist_method;

public class MainLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(1);
        linkedList.add(1,2);
        linkedList.add(2,3);

        linkedList.show();
    }
}