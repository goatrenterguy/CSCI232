package projects.project1;

class RadixSort{
    RadixSort(){}

    Comparable[] radixSort(Comparable[] randNums) {
        int places = getPlaces(randNums);
        int count = 0;
        //Sorting
        for (int p = 0; p < places; p++){
            Comparable[] tmp;
            tmp = new Comparable[randNums.length];
            for (int i = 0; i < randNums.length; i++) {
                tmp[i] = (int) ((((int)randNums[i]  % (10 * Math.pow(10,count))) / Math.pow(10, count)));
            }

            for (int i = 1; i < randNums.length; i++) {
                for (int a = i; a > 0 && (tmp[a].compareTo(tmp[a-1]) > 0); a--){
                        Comparable placeHolder = tmp[a];
                        tmp[a] = tmp[a - 1];
                        tmp[a - 1] = placeHolder;
                        placeHolder = randNums[a];
                        randNums[a] = randNums[a - 1];
                        randNums[a - 1] = placeHolder;
                }
            }
            count++;
        }
        return randNums;
    }


    private int getPlaces(Comparable[] randNums) {
        int max = 0;
        int places = 1;
        for (Comparable a: randNums) {
            if (max < (int)a){
                max = (int)a;
            }
        }
        while (max / 10 > 0) {
            max /= 10;
            places++;
        }
        return places;
    }


}
