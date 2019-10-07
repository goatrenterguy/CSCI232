package projects.project1;

class CocktailSort {
    CocktailSort() {
    }

    //CockTail sort
    Comparable[] cockTailSort(Comparable[] a) {
        int end = a.length;
        int start = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            //First outside loop of bubble sort from the bottom up
            for (int i = start; i < end - 1; i++) {
                if (a[i].compareTo(a[i+1]) < 0) {
                    Comparable tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    sorted = false;
                }
            }
            if (sorted){
                break;
            }
            end--;

            //Going from left to right
            for (int i = end - 1  ; i >= start; i--) {
                if (a[i].compareTo(a[i+1]) < 0) {
                    Comparable tmp = a[i];
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



