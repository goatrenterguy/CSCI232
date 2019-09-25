package labs.lab3;

import java.util.Random;

public class GenNumbers {

    public static void main(String args[]) {
        int n = 10000;
        Comparable[] randNums = genNums(n);
        //Selection Sort Test
        StopWatch sTime = new StopWatch();
        SelectionSort.sort(randNums.clone());
        System.out.println("Selection Sort time: " + sTime.elapsedTime());
        //Shell Sort Test
        StopWatch shellTime = new StopWatch();
        ShellSort.sort(randNums.clone());
        System.out.println("Shell Sort time: " + shellTime.elapsedTime());
        //Insertion Sort Test
        StopWatch iTime = new StopWatch();
        InsertionSort.sort(randNums.clone());
        System.out.println("Insertion Sort time: " + iTime.elapsedTime());


    }


    public static Comparable[] genNums(int n){
        Comparable[] a = new Comparable[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            a[i] = rand.nextInt();
        }
        return a;
    }
}
