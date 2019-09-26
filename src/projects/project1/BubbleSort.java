package projects.project1;

class BubbleSort {
    BubbleSort() {
    }
    //BubbleSort that runs in O(n^2)
    Comparable[] bubbleSort(Comparable[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (a[i].compareTo(a[j]) > 0){
                    int tmp = (int) a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
}
