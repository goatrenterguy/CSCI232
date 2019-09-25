package labs.lab2;
import java.util.Random;


//Names: Ben Guericke and Stuart Smith
public class SumRunner {
    public static void main(String args[]){
        int n = 1000;
        int a[] = new int[n];
        int count;
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            a[i] = rand.nextInt(7999) + 1;
        }
        FourSum four = new FourSum();
        StopWatch timer = new StopWatch();
        count = four.count(a);
        System.out.println("Random Numbers = " + n);
        System.out.println("Elapsed time = " + timer.elapsedTime());
        System.out.println(count);
    }
}
