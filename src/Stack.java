/**
 *
 * @author Tilini Rasara
 */
public class Stack {
    private int capacity;
    private char[] stackArray;
   private int top;
    
    public Stack(int chA) {
        capacity = chA;
        stackArray = new char[capacity];
        top = -1;
    }
      
    public void push(char A) {
           stackArray[++top] = A;
    }
    public char pop() {
             return stackArray[top--];

    }
    public char peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Empty");
            return 1;
        }
    }
    public boolean isEmpty() {
        return (top == - 1);
    }
    public boolean isFull() {
        return (top == capacity - 1);
    }
    public int size() {
        return top + 1;
    } 
}
