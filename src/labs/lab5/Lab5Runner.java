package labs.lab5;

import projects.project1.StopWatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab5Runner {
    public static void main(String args[]) throws FileNotFoundException {
        File manifesto = new File("src/labs/lab5/manifesto.txt");
        File reals = new File("src/labs/lab5/reals.txt");
        System.out.println("There are " + scanSort(manifesto) + " words in manifesto");
        System.out.println("There are " + scanSort(reals) + " numbers in reals");





    }
    //Scan File  f and sort it return n
    public static int scanSort(File f) throws FileNotFoundException {
        Scanner in = new Scanner(f);
        cSort sort = new cSort();
        int n = 0;
        int z = 0;
        while(in.hasNext()){
            n++;
            in.next();
        }
        in = new Scanner(f);
        Comparable[] a = new Comparable[n];
        while(in.hasNext()){
            a[z] = in.next();
            z++;
        }
        //Sort using cocktail sort
        StopWatch timer = new StopWatch();
        sort.cSort(a);
        System.out.println("Elapsed cocktail sort time = " + timer.elapsedTime());
        return n;
    }
}
