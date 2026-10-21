/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author user
 */

public class StackLinkedlist {

    // Node class
    private class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor
    public StackLinkedlist() {
        top = null;
    }

    // Push an element
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop an element
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }

        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek at the top element
    public int peek() {
        if (top == null) {
            return -1;
        }

        return top.data;
    }

    // Display the stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;

        System.out.println("Stack elements:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a stack
        StackLinkedlist stack = new StackLinkedlist();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

        // Display stack
        stack.display();

        // View top element
        System.out.println("Top element: " + stack.peek());

        // Remove an element
        System.out.println("Removed: " + stack.pop());

        // View top again
        System.out.println("Top element: " + stack.peek());

        // Display stack again
        stack.display();
    }
}
    