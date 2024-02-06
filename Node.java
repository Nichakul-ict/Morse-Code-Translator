/*
 * ID: 6588178   NAME: Nichakul Kongnual
 * SEC: 2
 */
/**
*   Please do not modify this code
*   This code is used for constructing the binary tree
*/
public class Node<E extends Comparable<E>> {

    private E value;
    private Node<E> left;
    private Node<E> right;

    public Node(E val) {
        value = val;
        left = null;
        right = null;
    }

    public E getValue() { 
        return value; 
    }

    public Node<E> getLeft() { 
        return left; 
    }

    public Node<E> getRight() {
        return right; 
    }
    
    public void setValue(E v) { 
        value = v; 
    }

    public void setLeft(Node<E> p) {
        left = p; 
    }

    public void setRight(Node<E> p) {
        right = p; 
    }

}
