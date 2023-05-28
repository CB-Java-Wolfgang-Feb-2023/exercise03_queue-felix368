package queue;

public class Main {
    public static void main(String[] args) {
        // create an object of Queue class
        // try to delete element from the queue
        // currently queue is empty
        // so deletion is not possible
        // insert elements to the queue
        // check when queue is full
        // removes element until it is empty
        // check if queue is empty

        MyQueue q1 = new MyQueue();

        //q1.dequeue();

        for (int i = 0; i < 20; i++) {
            q1.enqueue(i);
        }
        System.out.println(q1.toString());




        q1.dequeue();
        q1.dequeue();
        q1.dequeue();

        System.out.println(q1.toString());

        for (int i = 19; i < 40; i++) {
            q1.enqueue(i);
        }
        System.out.println(q1.toString());

    }
}
