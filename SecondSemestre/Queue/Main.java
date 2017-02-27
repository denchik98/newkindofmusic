package SecondSemestre.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new ArrayQ(8);
        queue.push(4);
        queue.push(8);
        queue.push(15);
        queue.push(16);
        queue.push(23);
        queue.push(42);

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();

        System.out.println(queue.first() + " " + queue.size());
    }
}
