package labs.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayStackApp {
    public static void main(String args[]) throws FileNotFoundException {
        //Create a new stack of type String with capacity of 100
        ArrayStack stack = new ArrayStack(100);
        File file = new File(args[0]);
        Scanner inFile = new Scanner(file);
        while(inFile.hasNext()) {
            stack.push(inFile.next());
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        //Test of rArray with numbers.txt
        System.out.println("rArray Test Numbers: \n--------------------");
        //Create a new generic stack with an default initial size of 2
        RArrayStack nStack = new RArrayStack();
        //Read in the file
        File numbers = new File("src/labs/lab1/numbers.txt");
        //Create scanner for the files
        inFile = new Scanner(numbers);
        //Push each element to the stack
        while(inFile.hasNext()) {
            nStack.push(inFile.next());
        }
        //Print the pop from all elements from the stack
        while(!nStack.isEmpty()){
            System.out.println(nStack.pop());
        }

        //Test of rArray with tinT.txt
        System.out.println("rArray Test tinyTale: \n--------------------");
        //Create a new generic stack with an default initial size of 2
        RArrayStack tStack = new RArrayStack();
        //Read in the file
        File tinyT = new File("src/labs/lab1/tinyTale.txt");

        inFile = new Scanner(tinyT);
        while(inFile.hasNext()) {
            tStack.push(inFile.next());
        }
        while(!tStack.isEmpty()){
            System.out.println(tStack.pop());
        }
    }
}
