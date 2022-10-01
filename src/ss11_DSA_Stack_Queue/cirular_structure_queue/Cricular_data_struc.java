package ss11_DSA_Stack_Queue.cirular_structure_queue;

import com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl;

import java.util.*;

public class Cricular_data_struc {
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }

    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }
    static int deQueue(Queue q){
        if(q.front == null){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if(q.front == q.rear){
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }
    static void displayQueue(Queue q){
        Node temp = q.front;
        System.out.println("Circular Queue is: ");
        while (temp.link != q.front){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;
        enQueue(q, 12);
        enQueue(q, 17);
        enQueue(q, 122);
        displayQueue(q);
        System.out.println(deQueue(q));
        System.out.println(deQueue(q));
        displayQueue(q);
        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);
    }
}
