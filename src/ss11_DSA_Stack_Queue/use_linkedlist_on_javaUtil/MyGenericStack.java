package ss11_DSA_Stack_Queue.use_linkedlist_on_javaUtil;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return stack.size();
    }

    public boolean print() {
        if (!stack.isEmpty()) {
            for (int i = 0; i < stack.size(); i++) {
                System.out.print(stack.get(i) +" ");
            }
        }
        return true;
    }

}
