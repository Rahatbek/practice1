package com.rahatbek.mytest.algorithmDataStructure.binarySearch;

public class GuessSolution {
    public int guessNumber(int n) {

        int low = 0;
        int high = n;

        int mid = 0;

        while(low <= high){
            mid = low + (high - low)/2;
            int ans = guess(mid);
            if(ans == 0){
                return mid;
            }else if(ans == 1){
                low = mid + 1;

            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int guess(int number) {
        return 0;
    }
}