// Stack(integer type) implementation 
package Stack;
public class Stack {
    /*declare variables that are to be used in a protected way,
    so that the user doesn't have access to these variables*/
    private int maxSize;
    private int top;
    private int[] stackArray;
    /* let's implement the stack method that uses all these varibles
     to define a stack */
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top=-1;
    }
    public void push(int value){
        if (top<(maxSize-1)){
            stackArray[++top]=value;
        } else {
            System.out.println("Stack overflow!");
        }
    }
    public int pop() {
        if (top>=0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack underflow!");
            return -1;
        }
    }
    public int peek() {
        if (top>=0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }   
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
}