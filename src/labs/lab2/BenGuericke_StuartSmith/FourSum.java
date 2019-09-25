package labs.lab2;

//Names: Ben Guericke and Stuart Smith

public class FourSum {

    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int z = k + 1; z < n; z++) {
                        if (a[i] + a[j] + a[k] + a[z] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
