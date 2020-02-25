package com.company;
import java.util.Stack;
//Eric Tiancheng Gu

/*
Implement the following operations of a queue using stacks.
• push(x) -- Push element x to the back of queue.
• pop() -- Removes the element from in front of queue.
• peek() -- Get the front element.
• empty() -- Return whether the queue is empty.
Example:
MyQueue queue = new MyQueue();
queue.push(1);
queue.push(2);
queue.peek(); // returns 1
queue.pop(); // returns 1
queue.empty(); // returns false
Notes:
• You must use only standard operations of a stack -- which means
only push to top, peek/pop from top, size, and is empty operations are
valid.
• Depending on your language, stack may not be supported natively. You
may simulate a stack by using a list or deque (double-ended queue), as
long as you use only standard operations of a stack.
• You may assume that all operations are valid (for example, no pop or
peek operations will be called on an empty queue).
 */

public class MyQueue {
    Stack<Integer> stackAlpha = new Stack<Integer>();
    Stack<Integer> stackBeta = new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
        stackAlpha = new Stack<Integer>();
        stackBeta = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackAlpha.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackBeta.isEmpty()) {
            while (!stackAlpha.isEmpty()) {
                stackBeta.push(stackAlpha.pop());
            }
            return stackBeta.pop();
        }

    }

    /** Get the front element. */
    public int peek() {
        if (stackBeta.isEmpty()) {
            while (!stackAlpha.isEmpty()) {
                stackBeta.push(stackAlpha.pop());
            }
            return stackBeta.peek();
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return(stackAlpha.isEmpty() && stackBeta.isEmpty());
    }


    public static void main(String[] args) {
	// write your code here
    }
}



