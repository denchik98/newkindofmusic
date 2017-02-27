package SecondSemestre.Deque;

public interface Deque {
    void pushFront(Object a);

    void pushBack(Object a);

    Object popFront();

    Object popBack();

    Object head();  //first

    Object tail();  //last

    int size();
}
