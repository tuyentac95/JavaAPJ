package stackbyarraylist;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is full");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return (index == 0);
    }

    public boolean isFull() {
        return (index == size);
    }
}
