package SecondSemestre.Queue;

public interface Queue {
    void push(Object a);
    Object first();
    Object pop();
    boolean isEmpty();
    int size();
}
