package exercise.implement_linkedlist_method;

public class MyLinkedList {
    Node head;
    int countNodes;

    public MyLinkedList(Object data) {
        this.head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node node = new Node(data);
        if (index<countNodes && index >= 0){
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        } else {
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
        countNodes++;
    }

    public void addFirst(Object data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        countNodes++;

    }

    public void show() {
        Node temp = head;
        for (int i = 0; i <= countNodes; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}