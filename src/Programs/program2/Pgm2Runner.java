package Programs.program2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pgm2Runner {

    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("src/Programs/program2/classes.csv");
        Scanner input;
        String line;
        String[] lineSplit;
        MsuClass[] classes = new MsuClass[100];
        int n = 0;

        //Read in file throw error if not found
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }

        // Scan in CSV file and create "Class" objects for each class and put in array of "Class"
        while(input.hasNextLine()){
            line = input.nextLine();
            lineSplit = line.split(",",28);
            String fullName = lineSplit[1];
            String[] name = fullName.split("-",2);
            //If empty create
            if (n==0){
                classes[n] = new MsuClass(name[0], 1, Integer.parseInt(lineSplit[4]), lineSplit[2], lineSplit[15] + " " + lineSplit[16]);
                n++;
            }
            //If names does not match previous create new class
            else if (!(name[0].equals(classes[n-1].getName())) && lineSplit[14].equals("Lecture")){
                classes[n] = new MsuClass(name[0], 1, Integer.parseInt(lineSplit[4]), lineSplit[2], lineSplit[15] + " " + lineSplit[16]);
                n++;
            }
            else if (lineSplit[14].equals("Lecture")){
                classes[n-1].addSects(1);
                classes[n-1].addSeats(Integer.parseInt(lineSplit[4]));
            }


        }

        // Print All Classes
//        int i = 0;
//        while (classes[i] != null){
//            System.out.println(classes[i].toString());
//            i++;
//        }

        //Create binary search tree
        BinarySearchTree<String, MsuClass> st = new BinarySearchTree<String, MsuClass>();
        int i = 0;
        while (classes[i] != null){
            st.put(classes[i].getWhenWhere(), classes[i]);
            i++;
        }
        //Print Depth-First
        System.out.println("Depth First:");
        System.out.format("%10s %6s %8s %36s %36s", "ID", "Sect", "Seats", "Title", "When");
        System.out.println();

        for (String s : st.keys()){
            System.out.println(st.get(s));
        }
        //Print Breadth-First
        System.out.println("Breadth First:");
        System.out.format("%10s %6s %8s %36s %36s", "ID", "Sect", "Seats", "Title", "When");
        System.out.println();

        for (String s : st.levelOrder()) {
            System.out.println(st.get(s));

        }
    }
}
