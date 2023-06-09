package homework.PartMain.task01stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // ожидаем 1
        System.out.println(queue.dequeue()); // ожидаем 2

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue()); // ожидаем 3
        System.out.println(queue.dequeue()); // ожидаем 4
        System.out.println(queue.dequeue()); // ожидаем 5
    }
}
