package my_stack;

public class MyStack<E> {
    int size;
    E[] elements = (E[]) new Object[5];

    public void updateArr() {
        E[] newElements = (E[]) new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public void add(E e) {
        if (size == elements.length) {
            updateArr();
        }
        elements[size] = e;
        size++;
    }

    public E pop() {
        E element = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }

    public E get() {
        return elements[size - 1];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

}