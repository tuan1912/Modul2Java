package my_stack_of_nodes;
public class MyStackOfNodes<E> {

    int size;
    Node<E> head;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public E pop() {
        E element = head.data;
        head = head.next;
        return element;
    }

    public E get() {
        return head.data;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void show() {
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}