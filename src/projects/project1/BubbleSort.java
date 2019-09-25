package projects.project1;

public class BubbleSort {
    public BubbleSort() {
    }

    public int[] bubbleSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
}
