package labs.lab1;

public class ArrayStack<T>{

    int N;  //Creates the variable for number of items in stack
    T[] a; //Creates the generic array

    //Creates an empty stack of type T
    public ArrayStack(int capacity) {
        a = (T[]) new Object[capacity];
        N = 0;
    }

    //Checks if the stack is empty
    public boolean isEmpty(){
        return N == 0;
    }
    //Returns the last added item
    public T peek(){
        return a[N-1];
    }

    //Removes the top of the stack and then returns the removed item
    public T pop() {
        T t = a[N-1];
        a[N-1] = null;
        N--;
        return t;
    }
    //Pushes Item T to the top of the stack if there is not enough room than it will double the array size
    void push(T t){
        a[N++] = t;
    }
}
