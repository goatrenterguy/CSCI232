package labs.extracredit1;

import java.util.Random;
import java.util.Stack;

public class stackTest {
    public static Stack<Integer> numStack = new Stack<>();
    public static int average;
    public static void main(String args[]){
        Random rand = new Random();
        for (int i = 0; i < 20; i++){
            numStack.push(rand.nextInt(100)+1);
        }
        numStack.toString();
        System.out.println(numStack.pop());
        numStack.toString();
        System.out.println(numStack.search("50"));
        while (!numStack.empty()) {
            average += numStack.pop();
        }
        System.out.println((double)average/20);
    }
}
