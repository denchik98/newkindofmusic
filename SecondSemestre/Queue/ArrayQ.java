package SecondSemestre.Queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayQ implements Queue {
    private List queue;
    private int capasity;

    public ArrayQ(int capasity) {
        queue = new ArrayList(capasity);
    }

    @Override
    public void push(Object a) {
        queue.add(a);
    }

    @Override
    public Object first() {
        return queue.get(0);
    }

    @Override
    public Object pop() {
        Object t = first();
        queue.remove(0);
        return t;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return queue.size();
    }
}
