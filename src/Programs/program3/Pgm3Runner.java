package Programs.program3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pgm3Runner {
    private static final String NEWLINE = System.getProperty("line.separator");

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Programs/program3/classes_mod_pgm3.csv");
        Scanner input = new Scanner(file);
        String line;
        String[] lineSplit;
        String[] vertices;
        MsuClass[] classes = new MsuClass[100];
        int n = 0;

        // Scan in CSV file and create "Class" objects for each class and put in array of "Class"
        while (input.hasNextLine()) {
            line = input.nextLine();
            lineSplit = line.split(",", 28);
            String fullName = lineSplit[1];
            String[] name = fullName.split("-", 2);

            //If empty create
            if (n == 0) {
                classes[n] = new MsuClass(name[0], 1, Integer.parseInt(lineSplit[4]), lineSplit[2], lineSplit[15] + " " + lineSplit[16], lineSplit[7].substring(1, lineSplit[7].length()));
                n++;
            }
            //If names does not match previous create new class
            else if (!(name[0].equals(classes[n - 1].getName())) && lineSplit[14].equals("Lecture")) {
                classes[n] = new MsuClass(name[0], 1, Integer.parseInt(lineSplit[4]), lineSplit[2], lineSplit[15] + " " + lineSplit[16], lineSplit[7].substring(1, lineSplit[7].length()));
                n++;
            } else if (lineSplit[14].equals("Lecture")) {
                classes[n - 1].addSects(1);
                classes[n - 1].addSeats(Integer.parseInt(lineSplit[4]));
            }
        }
        int NumClasses = 0;
        while (classes[n] != null) {
            NumClasses++;
        }
        //Create undirected graph of the classes
        Graph MsuGraph = new Graph(n);
        for (int c = 0; c < n; c++) {
            for (int z = 0; z < c; z++) {
                if (classes[c].getProf().equals(classes[z].getProf())) {
                    MsuGraph.addEdge(c, z);
                }
            }
        }
        String[] vertex;
        vertices = MsuGraph.toCString().split("\\R");
        System.out.println(MsuGraph.getVE());
        StringBuilder out = new StringBuilder();
        for (int v = 0; v < vertices.length - 1; v++) {
            vertex = vertices[v].split(",");
            out.append(classes[Integer.parseInt(vertex[0])].getName() + ", " + classes[Integer.parseInt(vertex[0])].getProf() + " also teaches ");
            for (int w = 1; w < vertex.length; w++) {
                out.append(classes[Integer.parseInt(vertex[w])].getName() + " ");
            }
            out.append(NEWLINE);

        }
        System.out.println(out.toString());
    }
}
