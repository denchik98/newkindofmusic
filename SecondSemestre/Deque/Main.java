package SecondSemestre.Deque;

public class Main {
    public static void main(String[] args) {
        Deque deque = new ArrayD();
        deque.pushFront(1);
        deque.pushFront(2);
        deque.pushFront(3);
        deque.pushFront(4);
        deque.pushFront(5);

        deque.pushBack(-1);
        deque.pushBack(-2);
        deque.pushBack(-3);

        System.out.println(deque.tail() + " " + deque.size());
    }
}
