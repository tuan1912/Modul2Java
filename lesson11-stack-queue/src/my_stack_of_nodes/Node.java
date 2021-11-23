package my_stack_of_nodes;

public class Node <E> {
    E data;
    Node<E> next;
    public Node(){

    }
    public Node(E data){
        this.data = data;
        this.next = null;
    }
    public Node(E data, Node<E> next){
        this.data =data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
