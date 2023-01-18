package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket;

@Version(value = "1.1", date = "2023-01-18")
public class CharSequenceImpl implements MyCharSequence, MyCharSequence2{

    char[] data;

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int index) {
        return data[index];
    }

    @Override
    public MyCharSequence subSequence(int start, int end) {
        return new CharSequenceImpl();
    }

    @Override
    public MyCharSequence subSequence(int start) {
        return MyCharSequence.super.subSequence(start);
    }
}
