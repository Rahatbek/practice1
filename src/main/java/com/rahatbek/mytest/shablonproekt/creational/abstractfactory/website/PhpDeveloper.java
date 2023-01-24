package com.rahatbek.mytest.shablonproekt.creational.abstractfactory.website;

import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
