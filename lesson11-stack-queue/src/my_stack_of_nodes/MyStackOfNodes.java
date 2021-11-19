package my_stack_of_nodes;

public class MyStackOfNodes<E> {
    int countNodes;
    Node<E> head;
    public MyStackOfNodes(){
    }
    public MyStackOfNodes(Node<E> node){
        head = node;
        countNodes++;
    }
    public void add (E e) {
        if (head == null) head = new Node<E>(e);
        else {
            Node<E> node = new Node<E>(e);
            node.next = head.next;
            head.next = node;
        }
    }
}
