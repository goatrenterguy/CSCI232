package projects.project1;

import java.util.Arrays;
import java.util.Random;

public class GenNumbers {

    public static void main(String[] args) {
        //Number of elements to be sorted
        int n = 100000;
        Comparable[] randNums = genNums(n);
        Comparable[] bOut = bubbleSortTest(randNums.clone());
        Comparable[] cOut = cockTailSortTest(randNums.clone());
        Comparable[] rOut = radixSortTest(randNums.clone());
        //Checks if all of the sorting algorithms produced the same results
        assert Arrays.equals(bOut,cOut): "BubbleSort Does not Equal CocktailSort";
        assert Arrays.equals(bOut, rOut): "BubbleSort does not equal RadixSort";

    }
    //Bubble Sort Test
    private static Comparable[] bubbleSortTest(Comparable[] randNums) {
        Comparable[] out;
        StopWatch timer = new StopWatch();
        BubbleSort bSort = new BubbleSort();
        out = bSort.bubbleSort(randNums);
        System.out.println("Elapsed bubble sort time = " + timer.elapsedTime());
        return out;
    }
    //Radix Sort Test
    private static Comparable[] radixSortTest(Comparable[] randNums){
        int[] out;
        int[] randsInt = new int[randNums.length];
        Comparable[] compOut = new Comparable[randNums.length];
        for (int x = 0; x <  randNums.length; x++){
            randsInt[x] = (int) randNums[x];
        }
        StopWatch timer = new StopWatch();
        RadixSort rSort = new RadixSort();
        out = rSort.radixSort(randsInt);
        System.out.println("Elapsed radix time = " + timer.elapsedTime());
        for (int y = 0; y <  randNums.length; y++){
            compOut[y] = (Comparable) out[y];
        }
        return compOut;
    }

    //Cocktail Sort Test
    private static Comparable[] cockTailSortTest(Comparable[] randNums){
        Comparable[] out;
        StopWatch timer = new StopWatch();
        CocktailSort cSort = new CocktailSort();
        out = cSort.cockTailSort(randNums);
        System.out.println("Elapsed cocktail sort time = " + timer.elapsedTime());
        return out;
    }

    //Generates random numbers between 1 and 500,000
    private static Comparable[] genNums(int n){
        Comparable[] a = new Comparable[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            a[i] = rand.nextInt(500000) + 1;
        }
        return a;
    }
}
