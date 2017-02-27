package SecondSemestre.Deque;

import java.util.LinkedList;

public class ArrayD implements Deque {
    private LinkedList deque;

    public ArrayD() {
        deque = new LinkedList();
    }

    @Override
    public void pushFront(Object a) {
        deque.add(0, a);
    }

    @Override
    public void pushBack(Object a) {
        deque.add(a);
    }

    @Override
    public Object popFront() {
        Object a = head();
        deque.remove(0);
        return a;
    }

    @Override
    public Object popBack() {
        Object a = tail();
        deque.remove(size() - 1);
        return a;
    }

    @Override
    public Object head() {
        return deque.get(0);
    }

    @Override
    public Object tail() {
        return deque.get(size() - 1);
    }

    @Override
    public int size() {
        return deque.size();
    }
}