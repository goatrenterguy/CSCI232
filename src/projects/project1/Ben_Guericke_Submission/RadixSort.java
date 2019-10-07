package projects.project1;

class RadixSort{
    RadixSort(){}

    int[] radixSort(int[] randNums) {

        int count = 0;
        int max = 0;
        //gets each individual digit and puts in into tmp
        for (int a: randNums) {
            if (max < (int)a){
                max = (int)a;
            }
        }
        int places = getPlaces(randNums,max);
        for (int p = 0; p < places; p++){
            int[] tmp;
            tmp = new int[randNums.length];
            for (int i = 0; i < randNums.length; i++) {
                tmp[i] = (int) ((((int)randNums[i]  % (10 * Math.pow(10,count))) / Math.pow(10, count)));
            }
            //Sorts by the given digit place i.e ones, tens, hundreds
            for (int i = 1; i < randNums.length; i++) {
                for (int a = i; a > 0 && (tmp[a] > tmp[a-1]); a--){
                        int placeHolder = tmp[a];
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

    //Returns the the number of digits that the largest number in randNums
    private int getPlaces(int[] randNums, int max) {
        int places = 1;
        //Finds digits in max
        while (max / 10 > 0) {
            max /= 10;
            places++;
        }
        return places;
    }


}
