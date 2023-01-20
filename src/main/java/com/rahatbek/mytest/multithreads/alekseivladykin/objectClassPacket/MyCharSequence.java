package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket;

public interface MyCharSequence {

    int subzero = 0;

    int length();

    char charAt(int i);

    MyCharSequence subSequence(int start, int end);

    default MyCharSequence subSequence(int start) {

        System.out.println();
        return subSequence(start, length());
    }
}
