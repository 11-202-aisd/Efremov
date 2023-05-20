package homework.PartMain.task01stack;

public class Stack<T> {
    private int size;
    private Object[] array;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.array = new Object[size];
        this.top = -1;
    }

    public void push(T item) {
        if (top == size - 1) {
            throw new RuntimeException("homework.stack.Stack is full");
        }
        top++;
        array[top] = item;
    }

    public T pop() {
        if (top == -1) {
            throw new RuntimeException("homework.stack.Stack is empty");
        }
        T item = (T) array[top];
        top--;
        return item;
    }

    public T peek() {
        if (top == -1) {
            throw new RuntimeException("homework.stack.Stack is empty");
        }
        return (T) array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

