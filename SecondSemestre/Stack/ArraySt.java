package SecondSemestre.Stack;

import java.util.ArrayList;
import java.util.List;

public class ArraySt implements Stack{
    private List data;

    public ArraySt(int capasity) {
        data = new ArrayList(capasity);
    }

    @Override
    public void push(Object a) {
        data.add(a);
    }

    @Override
    public Object top() {
        return data.get(size() - 1);
    }

    @Override
    public Object pop() {
        Object a = top();
        data.remove(data.size() - 1);
        return a;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
