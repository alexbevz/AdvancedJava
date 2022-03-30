package ru.bevz.aj.lesson2;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(new Node(value));
        }

        size++;
    }

    public String toString() {
        int[] result = new int[size];

        int index = 0;
        Node temp = head;

        while (temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        Node temp = head;

        while (index-- != 0)
            temp = temp.getNext();


        return temp.getValue();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node temp = head;

            while (index-- != 1)
                temp = temp.getNext();

            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }

    public void removeOther(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}
