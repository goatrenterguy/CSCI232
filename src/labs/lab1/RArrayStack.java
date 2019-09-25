package labs.lab1;

public class RArrayStack<T> extends ArrayStack<T> {
    //Constructor for a generic resizeable array
    RArrayStack() {
        //Creates an array with a default size of 2
        super(2);
    }
    //method to remove the top of the stack and return its value
    public T pop(){
        //Checks if the array is 1/4 or less full, it shortens it by half freeing up memory
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return super.pop();
    }

    //Method that creates and copies the stack to resize it
    private void resize(int capacity) {
        //Creates a new temporary array whose size depends on the capacity passed in
        T[] tmp = (T[]) new Object[capacity];
        //Loop through and copy over each element
        for (int j = 0; j < N; j++) {
            tmp[j] = a[j];
        }
        a = tmp;
    }

    //Method to push new generic item to the top of the stack
    public void push(T t){
        //Checks if the array is full and needs to be resized
        if (a.length == N) resize(a.length * 2);
        //Adds the item to the top of the stack
        a[N++] = t;
    }
}
