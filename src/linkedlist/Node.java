package linkedlist;

public class Node<T> {
    private Node<T> reference;
    private T t;

    public void setT(T t) {
        this.t = t;
    }
    public void setReference(Node<T> reference) {
        this.reference = reference;
    }
    public T getT() {
        return t;
    }
    public Node<T> getReference() {
        return reference;
    }


}
