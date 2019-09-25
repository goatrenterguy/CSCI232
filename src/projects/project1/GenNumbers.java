package projects.project1;

import javafx.scene.paint.Stop;

import java.util.Random;

public class GenNumbers {

    public static void main(String args[]) {
        int n = 100000;
        int[] randNums = genNums(n);
        int[] bOut;
        int[] rOut;
        int[] cOut;
        bubbleSortTest(randNums.clone());
        cockTailSortTest(randNums.clone());
    }
    //Bubble Sort Test
    public static int[] bubbleSortTest(int[] randNums) {
        int[] out;
        StopWatch timer = new StopWatch();
        BubbleSort bSort = new BubbleSort();
        out = bSort.bubbleSort(randNums);
        System.out.println("Elapsed bubble sort time = " + timer.elapsedTime());
//        for (int i:out){
//            System.out.println(i);
//        }
        return out;
    }
    //Radix Sort Test TODO: Create class RadixSort
    public static int[] radixSortTest(int[] randNums){
        int[] out;
        StopWatch timer = new StopWatch();
        RadixSort rSort = new RadixSort();
        out = rSort.radixSort(randNums);
        System.out.println("Elapsed radix time = " + timer.elapsedTime());
//            for (int i:out){
//            System.out.println(i);
//        }
        return out;
    }

    //Cocktail Sort Test TODO: Create class CocktailSort
    public static int[] cockTailSortTest(int[] randNums){
        int[] out;
        StopWatch timer = new StopWatch();
        CocktailSort cSort = new CocktailSort();
        out = cSort.cockTailSort(randNums);
        System.out.println("Elapsed cocktail sort time = " + timer.elapsedTime());
        //Print
//        for (int i:out){
//            System.out.println(i);
//        }
        return out;
    }


    public static int[] genNums(int n){
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            a[i] = rand.nextInt(500000) + 1;
        }
        return a;
    }
}
