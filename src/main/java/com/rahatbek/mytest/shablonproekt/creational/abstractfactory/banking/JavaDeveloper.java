package com.rahatbek.mytest.shablonproekt.creational.abstractfactory.banking;

import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
