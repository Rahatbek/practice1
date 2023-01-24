package com.rahatbek.mytest.shablonproekt.creational.factory;

public class CppDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
