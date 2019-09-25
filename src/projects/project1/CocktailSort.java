package projects.project1;

public class CocktailSort {
    public CocktailSort() {
    }
    //General bubble sort to the first pass

    public int[] cockTailSort(int[] a) {
        int end = a.length;
        int start = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            //First outside loop of bubble sort from the bottom up
            for (int i = start; i < end - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    sorted = false;
                }
            }

            end--;

            //Going from left to right
            for (int i = end - 1  ; i >= start; i--) {
                if (a[i] < a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    sorted = false;
                }
            }
            start++;
        }
        return a;
    }

}



