package my_stack_of_nodes;

public class Node <E> {
    E data;
    Node next;
    public Node(){

    }
    public Node(E data){
        this.data = data;
    }
    public Node(E data, Node next){
        this.data =data;
        this.next = next;
    }
}
