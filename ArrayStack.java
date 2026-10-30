/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Description: Array-based bounded stack (capacity 10) with a 2D Swing visualizer.
Programmed by: <your name> BSIT <cn> <subject>
Last Modified: October 30, 2026
Version: 1.0
Acknowledgements: <sites, and any generative AI used with the prompt>
*/

package stack;

/**
 *
 * @author Hi
 */
public class ArrayStack {

    public static final int CAPACITY = 10;
    private final int[] data = new int[CAPACITY];
    private int top = -1;

    public boolean isEmpty() { return top == -1; }
    public boolean isFull()  { return top == CAPACITY - 1; }
    public int size()        { return top + 1; }

    public void push(int value) {
        if (isFull()) throw new IllegalStateException("STACK OVERFLOW: Cannot push, stack is full");
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) throw new IllegalStateException("STACK UNDERFLOW: Cannot pop, stack is empty");
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) throw new IllegalStateException("STACK EMPTY: Nothing to peek");
        return data[top];
    }

    public void clear() { top = -1; }

    // Read-only access so the GUI can draw the blocks (index 0 = bottom)
    public int get(int index) { return data[index]; }
}
