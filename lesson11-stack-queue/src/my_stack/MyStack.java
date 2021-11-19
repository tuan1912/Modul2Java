package my_stack;

import static java.lang.System.arraycopy;

public class MyStack <E> {
    int size;
    E[] elements;
    public MyStack(){
    }
    public MyStack (int size){
        this.size = size;
        this.elements = (E[])new Object[size];
    }
    public void add(E e){
        E[] elementsNew = (E[])new Object[size+1];
        for (int i = 0; i < size; i++) {
            elementsNew[i] = elements[i];
        }
        elementsNew[size] = e;
        elements = elementsNew;
        size ++;
    }
    public  E pop() {
        if (size == 0) return null;
        else {
            E[] elementsNew = (E[])new Object[size-1];
            arraycopy(elements,0,elementsNew,0,size-1-1);
            elements = elementsNew;
            size --;
            return elements[size-1];
        }
    }
    public E get(){
        if (size == 0) return null;
        else return elements[size - 1];
    }
    public boolean isEmpty(){
        if (size == 0) return true;
        else return false;
    }
}
