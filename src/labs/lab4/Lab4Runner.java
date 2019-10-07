package labs.lab4;

import labs.lab3.StopWatch;

public class Lab4Runner {
    public static void main(String args[]) {
        int n = 100000;
        Comparable[] randNums = new Comparable[n];
        for (int i = 0; i < n; i++){
            randNums[i] = StdRandom.uniform(n) + 1;
        }
        //Merge Sort Test
        StopWatch shellTime = new StopWatch();
        MergeSort.sort(randNums.clone());
        System.out.println("Merge Sort time: " + shellTime.elapsedTime());
        //Insertion Sort Test
        StopWatch iTime = new StopWatch();
        QuickSort.sort(randNums.clone());
        System.out.println("Quick Sort time: " + iTime.elapsedTime());


    }
}
