package com.rahatbek.mytest.shablonproekt.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();

//        DeveloperFactory developerFactory = new CppDeveloperFactory();
//        Developer developer = developerFactory.createDeveloper();
//
//        developer.writeCode();

//        Developer javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeCode();
//
//        Developer cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCode();

//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeJavaCode();
//
//        CppDeveloper cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCppCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}
