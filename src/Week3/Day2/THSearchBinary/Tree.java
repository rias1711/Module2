package Week3.Day2.THSearchBinary;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
